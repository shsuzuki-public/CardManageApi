package com.cardmanage.domain.repository;

import java.util.List;

import com.cardmanage.domain.dto.ClanDto;
import com.cardmanage.infrastructure.entity.ClanEntity;

public interface ClanMRepository {
	List<ClanEntity> findAll();
	
	List<ClanEntity> search(String clanId, String memberStateId);
	
	ClanDto save(ClanDto clanData);
}
