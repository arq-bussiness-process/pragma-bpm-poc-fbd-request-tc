package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FieldType;
import io.swagger.model.SectionDocType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ValidateDocumentRq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-07-22T18:54:02.967Z")


public class ValidateDocumentRq   {
  @JsonProperty("Fields")
  @Valid
  private List<FieldType> fields = null;

  @JsonProperty("SectionsDoc")
  @Valid
  private List<SectionDocType> sectionsDoc = null;

  @JsonProperty("DocumentFile")
  private String documentFile = null;

  public ValidateDocumentRq fields(List<FieldType> fields) {
    this.fields = fields;
    return this;
  }

  public ValidateDocumentRq addFieldsItem(FieldType fieldsItem) {
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

  public ValidateDocumentRq sectionsDoc(List<SectionDocType> sectionsDoc) {
    this.sectionsDoc = sectionsDoc;
    return this;
  }

  public ValidateDocumentRq addSectionsDocItem(SectionDocType sectionsDocItem) {
    if (this.sectionsDoc == null) {
      this.sectionsDoc = new ArrayList<SectionDocType>();
    }
    this.sectionsDoc.add(sectionsDocItem);
    return this;
  }

  /**
   * Get sectionsDoc
   * @return sectionsDoc
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SectionDocType> getSectionsDoc() {
    return sectionsDoc;
  }

  public void setSectionsDoc(List<SectionDocType> sectionsDoc) {
    this.sectionsDoc = sectionsDoc;
  }

  public ValidateDocumentRq documentFile(String documentFile) {
    this.documentFile = documentFile;
    return this;
  }

  /**
   * Get documentFile
   * @return documentFile
  **/
  @ApiModelProperty(value = "")


  public String getDocumentFile() {
    return documentFile;
  }

  public void setDocumentFile(String documentFile) {
    this.documentFile = documentFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateDocumentRq validateDocumentRq = (ValidateDocumentRq) o;
    return Objects.equals(this.fields, validateDocumentRq.fields) &&
        Objects.equals(this.sectionsDoc, validateDocumentRq.sectionsDoc) &&
        Objects.equals(this.documentFile, validateDocumentRq.documentFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, sectionsDoc, documentFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateDocumentRq {\n");
    
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    sectionsDoc: ").append(toIndentedString(sectionsDoc)).append("\n");
    sb.append("    documentFile: ").append(toIndentedString(documentFile)).append("\n");
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

