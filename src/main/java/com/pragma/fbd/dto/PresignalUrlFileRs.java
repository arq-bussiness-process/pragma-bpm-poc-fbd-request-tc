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
public class PresignalUrlFileRs {
	
	  @JsonProperty("RqUID")
	  private String rqUID = null;

	  @JsonProperty("StatusCode")
	  private String statusCode = null;

	  @JsonProperty("StatusDesc")
	  private String statusDesc = null;
	  
	  @JsonProperty("PresignalUrl")
	  private String presignalUrl = null;

}
