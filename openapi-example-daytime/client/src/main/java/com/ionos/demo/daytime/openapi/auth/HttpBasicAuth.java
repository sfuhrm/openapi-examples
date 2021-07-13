/*
 * Daytime API
 * Tells the current date and time
 *
 * The version of the OpenAPI document: 0.0.3
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.ionos.demo.daytime.openapi.auth;

import com.ionos.demo.daytime.openapi.Pair;
import java.util.List;
import java.util.Map;
import okhttp3.Credentials;

public class HttpBasicAuth implements Authentication {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public void applyToParams(
      List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams) {
    if (username == null && password == null) {
      return;
    }
    headerParams.put(
        "Authorization",
        Credentials.basic(username == null ? "" : username, password == null ? "" : password));
  }
}