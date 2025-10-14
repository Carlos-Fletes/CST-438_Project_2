package com.example.demo.repository;

import com.example.demo.model.Vocab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VocabRepository extends JpaRepository<Vocab, Integer> {
}
