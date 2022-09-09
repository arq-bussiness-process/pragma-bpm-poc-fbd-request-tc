package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateJobRs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-08T22:08:20.281Z")


public class CreateJobRs   {
  @JsonProperty("RqUID")
  private String rqUID = null;

  @JsonProperty("StatusCode")
  private String statusCode = null;

  @JsonProperty("StatusDesc")
  private String statusDesc = null;

  @JsonProperty("JobId")
  private String jobId = null;

  public CreateJobRs rqUID(String rqUID) {
    this.rqUID = rqUID;
    return this;
  }

  /**
   * Identificador de Transaccion
   * @return rqUID
  **/
  @ApiModelProperty(value = "Identificador de Transaccion")


  public String getRqUID() {
    return rqUID;
  }

  public void setRqUID(String rqUID) {
    this.rqUID = rqUID;
  }

  public CreateJobRs statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Código de Respuesta
   * @return statusCode
  **/
  @ApiModelProperty(value = "Código de Respuesta")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public CreateJobRs statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

  /**
   * Descripción del Código de Respuesta
   * @return statusDesc
  **/
  @ApiModelProperty(value = "Descripción del Código de Respuesta")


  public String getStatusDesc() {
    return statusDesc;
  }

  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }

  public CreateJobRs jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(value = "")


  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateJobRs createJobRs = (CreateJobRs) o;
    return Objects.equals(this.rqUID, createJobRs.rqUID) &&
        Objects.equals(this.statusCode, createJobRs.statusCode) &&
        Objects.equals(this.statusDesc, createJobRs.statusDesc) &&
        Objects.equals(this.jobId, createJobRs.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rqUID, statusCode, statusDesc, jobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateJobRs {\n");
    
    sb.append("    rqUID: ").append(toIndentedString(rqUID)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

