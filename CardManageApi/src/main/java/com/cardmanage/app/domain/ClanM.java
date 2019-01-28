package com.cardmanage.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cardmanage.app.domain.ClanM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CLAN_M")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClanM {
	@Id
	@Column(name="CLAN_ID",nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer clanId;
	@Column(name="CLAN_NAME",nullable=false)
	private String clanName;
	@Column(name="INSERT_DATE",nullable=false)
	private String insertDate;
	@Column(name="UPDATE_DATE",nullable=false)
	private String updateDate;
	@Column(name="DELETE_FLAG",nullable=false)
	private String deleteFlag;
	@Column(name="VERSION_NO",nullable=false)
	private String versionNo;
}
