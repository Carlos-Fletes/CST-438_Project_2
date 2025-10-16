package com.example.demo.service;

import com.example.demo.model.Vocab;
import com.example.demo.repository.VocabRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class VocabServiceTest {

    @Mock
    private VocabRepository vocabRepository;

    @InjectMocks
    private VocabService vocabService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllVocab() {
        Vocab v1 = new Vocab("Word1", "Definition1");
        Vocab v2 = new Vocab("Word2", "Definition2");

        when(vocabRepository.findAll()).thenReturn(Arrays.asList(v1, v2));

        List<Vocab> result = vocabService.getAllVocab();

        assertEquals(2, result.size());
        verify(vocabRepository, times(1)).findAll();
    }

    @Test
    void testGetVocabByIdFound() {
        Vocab vocab = new Vocab("Word", "Definition");
        when(vocabRepository.findById(1)).thenReturn(Optional.of(vocab));

        Optional<Vocab> result = vocabService.getVocabById(1);

        assertTrue(result.isPresent());
        assertEquals("Word", result.get().getWord());
    }

    @Test
    void testGetVocabByIdNotFound() {
        when(vocabRepository.findById(1)).thenReturn(Optional.empty());

        Optional<Vocab> result = vocabService.getVocabById(1);

        assertFalse(result.isPresent());
    }

    @Test
    void testAddVocab() {
        Vocab vocab = new Vocab( "NewWord", "NewDefinition");
        Vocab savedVocab = new Vocab( "NewWord", "NewDefinition");

        savedVocab.setId(1);
        when(vocabRepository.save(vocab)).thenReturn(savedVocab);

        Vocab result = vocabService.addVocab(vocab);

        assertNotNull(result.getId());
        assertEquals("NewWord", result.getWord());
        assertEquals("NewDefinition", result.getDefinition());
        verify(vocabRepository, times(1)).save(vocab);
    }

    @Test
    void testDeleteVocab() {
        doNothing().when(vocabRepository).deleteById(1);

        vocabService.deleteVocab(1);

        verify(vocabRepository, times(1)).deleteById(1);
    }

    @Test
    void testUpdateVocabFound() {
        Vocab existing = new Vocab( "OldWord", "OldDefinition");
        Vocab updated = new Vocab( "NewWord", "NewDefinition");
        Vocab saved = new Vocab("NewWord", "NewDefinition");

        when(vocabRepository.findById(1)).thenReturn(Optional.of(existing));
        when(vocabRepository.save(any(Vocab.class))).thenReturn(saved);

        Vocab result = vocabService.updateVocab(1, updated);

        assertEquals("NewWord", result.getWord());
        assertEquals("NewDefinition", result.getDefinition());
    }

    @Test
    void testUpdateVocabNotFound() {
        Vocab updated = new Vocab("NEWWord", "NewWord");

        when(vocabRepository.findById(1)).thenReturn(Optional.empty());

        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            vocabService.updateVocab(1, updated);
        });

        assertEquals("Vocab not found", ex.getMessage());
    }
}
