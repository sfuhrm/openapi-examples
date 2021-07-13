package com.ionos.demo.shoppingcart.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

/** ShoppingCartObject */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ShoppingCartObject {
  @JsonProperty("id")
  private String id;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("created_at")
  @org.springframework.format.annotation.DateTimeFormat(
      iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("expires_at")
  @org.springframework.format.annotation.DateTimeFormat(
      iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiresAt;

  public ShoppingCartObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(readOnly = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShoppingCartObject owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   *
   * @return owner
   */
  @ApiModelProperty(example = "stephan.fuhrmann", readOnly = true, value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ShoppingCartObject createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   *
   * @return createdAt
   */
  @ApiModelProperty(readOnly = true, value = "")
  @Valid
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ShoppingCartObject expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   *
   * @return expiresAt
   */
  @ApiModelProperty(value = "")
  @Valid
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCartObject shoppingCartObject = (ShoppingCartObject) o;
    return Objects.equals(this.id, shoppingCartObject.id)
        && Objects.equals(this.owner, shoppingCartObject.owner)
        && Objects.equals(this.createdAt, shoppingCartObject.createdAt)
        && Objects.equals(this.expiresAt, shoppingCartObject.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, createdAt, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartObject {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
