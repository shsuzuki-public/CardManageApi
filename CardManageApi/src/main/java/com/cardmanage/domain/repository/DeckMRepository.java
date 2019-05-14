package com.cardmanage.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cardmanage.infrastructure.entity.DeckM;

@Repository
public interface DeckMRepository extends JpaRepository<DeckM,Integer> {
	@Query(value="SELECT * FROM DECK_M WHERE CLAN_ID = :clanId", nativeQuery = true)
	List<DeckM> findDecksByClanId(@Param("clanId") Integer clanId);
}