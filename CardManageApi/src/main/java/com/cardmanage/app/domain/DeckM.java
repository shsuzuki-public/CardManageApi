package com.cardmanage.app.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="DECK_M")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeckM implements Serializable{
	@Id
	@Column(name="DECK_ID",nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer deckId;
	@Column(name="CLAN_ID",nullable=false)
	private Integer clanId;
	@Column(name="REGULATION_FLAG",nullable=false)
	private Integer regFlag;
	@Column(name="DECK_NAME")
	private String deckName;
	@Column(name="INSERT_DATE",nullable=false)
	private String insertDate;
	@Column(name="UPDATE_DATE",nullable=false)
	private String updateDate;
	@Column(name="DELETE_FLAG",nullable=false)
	private String deleteFlag;
	@Column(name="VERSION_NO",nullable=false)
	private String versionNo;
}