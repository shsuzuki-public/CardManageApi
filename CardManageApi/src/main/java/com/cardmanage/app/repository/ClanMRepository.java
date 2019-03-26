package com.cardmanage.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cardmanage.app.domain.ClanM;

@Repository
public interface ClanMRepository extends JpaRepository<ClanM, Integer>{
	@Query(value="SELECT * FROM CLAN_M WHERE CLAN_ID = :clanId", nativeQuery = true)
	ClanM findOne(@Param("clanId") String clanId);
}
