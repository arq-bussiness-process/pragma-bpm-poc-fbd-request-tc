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
 * SectionDocType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-07T16:38:50.063Z")


public class SectionDocType   {
  @JsonProperty("SectionName")
  private String sectionName = null;

  @JsonProperty("Fields")
  @Valid
  private List<FieldType> fields = null;

  public SectionDocType sectionName(String sectionName) {
    this.sectionName = sectionName;
    return this;
  }

  /**
   * Nombre del campo a validar
   * @return sectionName
  **/
  @ApiModelProperty(value = "Nombre del campo a validar")


  public String getSectionName() {
    return sectionName;
  }

  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }

  public SectionDocType fields(List<FieldType> fields) {
    this.fields = fields;
    return this;
  }

  public SectionDocType addFieldsItem(FieldType fieldsItem) {
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
    SectionDocType sectionDocType = (SectionDocType) o;
    return Objects.equals(this.sectionName, sectionDocType.sectionName) &&
        Objects.equals(this.fields, sectionDocType.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionName, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionDocType {\n");
    
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
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

