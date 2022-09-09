package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FieldType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ValidateDocumentRs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-07-22T18:54:02.967Z")


public class ValidateDocumentRs   {
  @JsonProperty("RqUID")
  private String rqUID = null;

  @JsonProperty("StatusCode")
  private String statusCode = null;

  @JsonProperty("StatusDesc")
  private String statusDesc = null;

  @JsonProperty("Fields")
  @Valid
  private List<FieldType> fields = null;

  public ValidateDocumentRs rqUID(String rqUID) {
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

  public ValidateDocumentRs statusCode(String statusCode) {
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

  public ValidateDocumentRs statusDesc(String statusDesc) {
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

  public ValidateDocumentRs fields(List<FieldType> fields) {
    this.fields = fields;
    return this;
  }

  public ValidateDocumentRs addFieldsItem(FieldType fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<FieldType>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FieldType> getFields() {
    return fields;
  }

  public void setFields(List<FieldType> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateDocumentRs validateDocumentRs = (ValidateDocumentRs) o;
    return Objects.equals(this.rqUID, validateDocumentRs.rqUID) &&
        Objects.equals(this.statusCode, validateDocumentRs.statusCode) &&
        Objects.equals(this.statusDesc, validateDocumentRs.statusDesc) &&
        Objects.equals(this.fields, validateDocumentRs.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rqUID, statusCode, statusDesc, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateDocumentRs {\n");
    
    sb.append("    rqUID: ").append(toIndentedString(rqUID)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

