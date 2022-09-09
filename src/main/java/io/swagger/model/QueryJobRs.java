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
 * QueryJobRs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-08T22:08:20.281Z")


public class QueryJobRs   {
  @JsonProperty("RqUID")
  private String rqUID = null;

  @JsonProperty("StatusCode")
  private String statusCode = null;

  @JsonProperty("StatusDesc")
  private String statusDesc = null;

  @JsonProperty("JobId")
  private String jobId = null;

  @JsonProperty("StatusJobId")
  private String statusJobId = null;

  public QueryJobRs rqUID(String rqUID) {
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

  public QueryJobRs statusCode(String statusCode) {
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

  public QueryJobRs statusDesc(String statusDesc) {
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

  public QueryJobRs jobId(String jobId) {
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

  public QueryJobRs statusJobId(String statusJobId) {
    this.statusJobId = statusJobId;
    return this;
  }

  /**
   * Get statusJobId
   * @return statusJobId
  **/
  @ApiModelProperty(value = "")


  public String getStatusJobId() {
    return statusJobId;
  }

  public void setStatusJobId(String statusJobId) {
    this.statusJobId = statusJobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryJobRs queryJobRs = (QueryJobRs) o;
    return Objects.equals(this.rqUID, queryJobRs.rqUID) &&
        Objects.equals(this.statusCode, queryJobRs.statusCode) &&
        Objects.equals(this.statusDesc, queryJobRs.statusDesc) &&
        Objects.equals(this.jobId, queryJobRs.jobId) &&
        Objects.equals(this.statusJobId, queryJobRs.statusJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rqUID, statusCode, statusDesc, jobId, statusJobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryJobRs {\n");
    
    sb.append("    rqUID: ").append(toIndentedString(rqUID)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    statusJobId: ").append(toIndentedString(statusJobId)).append("\n");
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

