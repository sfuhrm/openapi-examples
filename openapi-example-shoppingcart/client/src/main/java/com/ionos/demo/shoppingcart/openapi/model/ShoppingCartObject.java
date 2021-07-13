/*
 * Shopping cart API
 * Manages a shopping cart
 *
 * The version of the OpenAPI document: 0.1.1
 * Contact: stephan.fuhrmann@ionos.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.ionos.demo.shoppingcart.openapi.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Objects;

/** ShoppingCartObject */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShoppingCartObject {
  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OWNER = "owner";

  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";

  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  /**
   * Get id
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  /**
   * Get owner
   *
   * @return owner
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stephan.fuhrmann", value = "")
  public String getOwner() {
    return owner;
  }

  /**
   * Get createdAt
   *
   * @return createdAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
