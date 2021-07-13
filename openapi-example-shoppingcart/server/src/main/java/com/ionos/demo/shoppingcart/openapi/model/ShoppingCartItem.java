package com.ionos.demo.shoppingcart.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.*;

/** ShoppingCartItem */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ShoppingCartItem {
  @JsonProperty("index")
  private Integer index;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("item_asin")
  private String itemAsin;

  public ShoppingCartItem index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index minimum: 0
   *
   * @return index
   */
  @ApiModelProperty(example = "0", value = "")
  @Min(0)
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public ShoppingCartItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity minimum: 1
   *
   * @return quantity
   */
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull
  @Min(1)
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ShoppingCartItem itemAsin(String itemAsin) {
    this.itemAsin = itemAsin;
    return this;
  }

  /**
   * Get itemAsin
   *
   * @return itemAsin
   */
  @ApiModelProperty(example = "B0711Z67W9", required = true, value = "")
  @NotNull
  @Pattern(regexp = "[0-9A-Z]{10}")
  public String getItemAsin() {
    return itemAsin;
  }

  public void setItemAsin(String itemAsin) {
    this.itemAsin = itemAsin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCartItem shoppingCartItem = (ShoppingCartItem) o;
    return Objects.equals(this.index, shoppingCartItem.index)
        && Objects.equals(this.quantity, shoppingCartItem.quantity)
        && Objects.equals(this.itemAsin, shoppingCartItem.itemAsin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, quantity, itemAsin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartItem {\n");

    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    itemAsin: ").append(toIndentedString(itemAsin)).append("\n");
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
