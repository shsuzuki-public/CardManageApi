package com.cardmanage.infrastructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Builder;

import com.cardmanage.domain.dto.ClanDto;
import com.cardmanage.infrastructure.entity.ClanEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Table(name="CLAN_M")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClanEntity {
	@Id
	@Column(name="CLAN_ID",nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLAN_ID_SEQ")
	@SequenceGenerator(name = "CLAN_ID_SEQ", sequenceName="CLAN_ID_SEQ", allocationSize=1)
	private String clanId;

	@Column(name="CLAN_NAME",nullable=false)
	private String clanName;
	
	@Column(name="MEMBER_STATE_ID", nullable=false)
	private String memberStateId;

	public static ClanEntity build(ClanDto clan) {
		return ClanEntity.builder()
				.clanId(clan.getClanId())
				.clanName(clan.getClanName())
				.memberStateId(clan.getMemberStateId())
				.build();
	}

	public ClanDto toDomainClan() {
		return ClanDto.builder()
				.clanId(this.clanId)
				.clanName(this.clanName)
				.memberStateId(this.memberStateId)
				.build();
	}
}
