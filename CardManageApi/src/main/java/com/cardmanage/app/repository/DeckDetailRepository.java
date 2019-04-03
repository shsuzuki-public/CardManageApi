package com.cardmanage.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cardmanage.app.domain.DeckDetailT;

@Repository
public interface DeckDetailRepository extends JpaRepository<DeckDetailT,Integer> {
	@Query(value="SELECT CARD_ID ,ADOPT_NUM FROM DECK_DETAIL_T WHERE DECK_ID = :dackId", nativeQuery = true)
	List<DeckDetailT> findDeckDetailByDeckId(@Param("deckId") Integer deckId);
}