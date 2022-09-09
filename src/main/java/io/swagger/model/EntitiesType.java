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
 * EntitiesType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-08T22:08:20.281Z")


public class EntitiesType   {
  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("Text")
  private String text = null;

  @JsonProperty("Score")
  private String score = null;

  public EntitiesType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Nombre Entidad
   * @return type
  **/
  @ApiModelProperty(value = "Nombre Entidad")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EntitiesType text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Valor Entidad
   * @return text
  **/
  @ApiModelProperty(value = "Valor Entidad")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public EntitiesType score(String score) {
    this.score = score;
    return this;
  }

  /**
   * Porcentaje de confianza
   * @return score
  **/
  @ApiModelProperty(value = "Porcentaje de confianza")


  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitiesType entitiesType = (EntitiesType) o;
    return Objects.equals(this.type, entitiesType.type) &&
        Objects.equals(this.text, entitiesType.text) &&
        Objects.equals(this.score, entitiesType.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitiesType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

