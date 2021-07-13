package com.ionos.demo.daytime.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

/** DateTimeObject */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DateTimeObject {
  @JsonProperty("date")
  @org.springframework.format.annotation.DateTimeFormat(
      iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime date;

  public DateTimeObject date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The date and time in RFC 3339, section 5.6 format.
   *
   * @return date
   */
  @ApiModelProperty(required = true, value = "The date and time in RFC 3339, section 5.6 format.")
  @NotNull
  @Valid
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeObject dateTimeObject = (DateTimeObject) o;
    return Objects.equals(this.date, dateTimeObject.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeObject {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
