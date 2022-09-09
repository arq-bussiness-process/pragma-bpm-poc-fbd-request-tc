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
 * FieldType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-08T22:08:20.281Z")


public class FieldType   {
  @JsonProperty("Key")
  private String key = null;

  @JsonProperty("Value")
  private String value = null;

  @JsonProperty("Condition")
  private String condition = null;

  @JsonProperty("Message")
  private String message = null;

  public FieldType key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Nombre del campo a validar
   * @return key
  **/
  @ApiModelProperty(value = "Nombre del campo a validar")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FieldType value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Valor del campo a validar
   * @return value
  **/
  @ApiModelProperty(value = "Valor del campo a validar")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public FieldType condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Condicion a validar sobre el campo
   * @return condition
  **/
  @ApiModelProperty(value = "Condicion a validar sobre el campo")


  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public FieldType message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Condicion a validar sobre el campo
   * @return message
  **/
  @ApiModelProperty(value = "Condicion a validar sobre el campo")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldType fieldType = (FieldType) o;
    return Objects.equals(this.key, fieldType.key) &&
        Objects.equals(this.value, fieldType.value) &&
        Objects.equals(this.condition, fieldType.condition) &&
        Objects.equals(this.message, fieldType.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, condition, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldType {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

