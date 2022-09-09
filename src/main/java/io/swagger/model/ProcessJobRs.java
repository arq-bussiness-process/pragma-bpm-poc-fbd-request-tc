package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntitiesType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessJobRs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-08T22:08:20.281Z")


public class ProcessJobRs   {
  @JsonProperty("RqUID")
  private String rqUID = null;

  @JsonProperty("StatusCode")
  private String statusCode = null;

  @JsonProperty("StatusDesc")
  private String statusDesc = null;

  @JsonProperty("Entities")
  @Valid
  private List<EntitiesType> entities = null;

  public ProcessJobRs rqUID(String rqUID) {
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

  public ProcessJobRs statusCode(String statusCode) {
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

  public ProcessJobRs statusDesc(String statusDesc) {
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

  public ProcessJobRs entities(List<EntitiesType> entities) {
    this.entities = entities;
    return this;
  }

  public ProcessJobRs addEntitiesItem(EntitiesType entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<EntitiesType>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * Get entities
   * @return entities
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EntitiesType> getEntities() {
    return entities;
  }

  public void setEntities(List<EntitiesType> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessJobRs processJobRs = (ProcessJobRs) o;
    return Objects.equals(this.rqUID, processJobRs.rqUID) &&
        Objects.equals(this.statusCode, processJobRs.statusCode) &&
        Objects.equals(this.statusDesc, processJobRs.statusDesc) &&
        Objects.equals(this.entities, processJobRs.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rqUID, statusCode, statusDesc, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessJobRs {\n");
    
    sb.append("    rqUID: ").append(toIndentedString(rqUID)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

