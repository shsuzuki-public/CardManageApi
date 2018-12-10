package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.domain.DeckM;

@Repository
public interface DeckMRepository extends JpaRepository<DeckM,Integer> {
}

