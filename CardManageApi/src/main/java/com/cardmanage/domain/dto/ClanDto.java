package com.cardmanage.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClanDto {
	private String clanId;
	
	private String clanName;
	
	private String memberStateId;
}
