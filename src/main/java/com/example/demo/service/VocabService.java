package com.example.demo.service;

import com.example.demo.model.Vocab;
import com.example.demo.repository.VocabRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VocabService {

    private final VocabRepository vocabRepository;

    public VocabService(VocabRepository vocabRepository) {
        this.vocabRepository = vocabRepository;
    }

    public List<Vocab> getAllVocab() {
        return vocabRepository.findAll();
    }

    public Optional<Vocab> getVocabById(Integer id) {
        return vocabRepository.findById(id);
    }

    public Vocab addVocab(Vocab vocab) {
        return vocabRepository.save(vocab);
    }

    public void deleteVocab(Integer id) {
        vocabRepository.deleteById(id);
    }

    public Vocab updateVocab(Integer id, Vocab updatedVocab) {
        return vocabRepository.findById(id)
                .map(vocab -> {
                    vocab.setWord(updatedVocab.getWord());
                    vocab.setDefinition(updatedVocab.getDefinition());
                    return vocabRepository.save(vocab);
                })
                .orElseThrow(() -> new RuntimeException("Vocab not found"));
    }
}
