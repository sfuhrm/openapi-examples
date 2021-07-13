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

package com.ionos.demo.shoppingcart.openapi.auth;

import com.ionos.demo.shoppingcart.openapi.Pair;
import java.util.List;
import java.util.Map;

public interface Authentication {
  /**
   * Apply authentication settings to header and query params.
   *
   * @param queryParams List of query parameters
   * @param headerParams Map of header parameters
   * @param cookieParams Map of cookie parameters
   */
  void applyToParams(
      List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams);
}