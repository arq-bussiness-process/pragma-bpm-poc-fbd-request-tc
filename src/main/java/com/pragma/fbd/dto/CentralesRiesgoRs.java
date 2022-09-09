package com.pragma.fbd.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CentralesRiesgoRs {
	
	@JsonProperty("StatusReport")
	public Boolean StatusReport;
	@JsonProperty("Score")
	public int Score;
	@JsonProperty("ActiveProducts")
	public String ActiveProducts;

}
