package com.example.demo.controller;

import com.example.demo.model.Vocab;
import com.example.demo.service.VocabService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vocab")
public class VocabController {

    private final VocabService vocabService;

    public VocabController(VocabService vocabService) {
        this.vocabService = vocabService;
    }

    @GetMapping
    public List<Vocab> getAllVocab() {
        return vocabService.getAllVocab();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vocab> getVocabById(@PathVariable Integer id) {
        return vocabService.getVocabById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vocab addVocab(@RequestBody Vocab vocab) {
        return vocabService.addVocab(vocab);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vocab> updateVocab(@PathVariable Integer id, @RequestBody Vocab vocab) {
        try {
            Vocab updated = vocabService.updateVocab(id, vocab);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVocab(@PathVariable Integer id) {
        vocabService.deleteVocab(id);
        return ResponseEntity.noContent().build();
    }
}
