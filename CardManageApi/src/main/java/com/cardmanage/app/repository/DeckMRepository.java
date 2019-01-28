package com.cardmanage.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cardmanage.app.domain.DeckM;

@Repository
public interface DeckMRepository extends JpaRepository<DeckM,Integer> {
	@Query(value="SELECT * FROM DECK_M WHERE DECK_ID = :deckId limit 1", nativeQuery = true)
	Optional<DeckM> findDeckFromId(@Param("deckId") Integer deckId);
}

