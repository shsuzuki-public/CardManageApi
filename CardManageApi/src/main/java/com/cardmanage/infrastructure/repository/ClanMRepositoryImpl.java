package com.cardmanage.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cardmanage.domain.dto.ClanDto;
import com.cardmanage.domain.repository.ClanMRepository;
import com.cardmanage.infrastructure.entity.ClanEntity;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ClanMRepositoryImpl implements ClanMRepository{
	@NonNull
	private final ClanMJpaRepository clanMJpaRepository;
	@Autowired
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<ClanEntity> search(String clanId, String memberStateId) {
		StringBuilder sql = new StringBuilder();
		boolean whereFlg = false;
		boolean andFlg = false;
		boolean clanIdFlg = false;
		boolean memberStateIdFlg = false;
		sql.append("SELECT T1.* FROM CLAN_M T1 WHERE ");
		if(!"".equals(clanId) && clanId != null) {
			sql.append("T1.CLAN_ID = :clanId ");
			whereFlg = true;
			andFlg = true;
			clanIdFlg = true;
		}

		if(!"".equals(memberStateId) && memberStateId != null) {
			if(andFlg) {
				sql.append("AND ");
			}
			sql.append("T1.MEMBER_STATE_ID = :memberStateId ");
			whereFlg = true;
			andFlg = true;
			memberStateIdFlg = true;
		}

		if(!whereFlg) {
			throw new IllegalArgumentException("");
		}

		Query query = entityManager.createQuery(sql.toString());
		if(clanIdFlg) {
			query.setParameter("clanId", clanId);
		}

		if(memberStateIdFlg) {
			query.setParameter("memberStateId", memberStateId);
		}

		return query.getResultList();
	}

	@Override
	public List<ClanEntity> findAll() {
		return this.clanMJpaRepository.findAll();
	}

	@Override
	public ClanDto save(ClanDto clanData) {
		return this.clanMJpaRepository.save(ClanEntity.build(clanData))
				.toDomainClan();
	}
}
