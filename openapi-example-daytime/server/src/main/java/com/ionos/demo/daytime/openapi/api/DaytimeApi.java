/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package com.ionos.demo.daytime.openapi.api;

import com.ionos.demo.daytime.openapi.model.DateTimeObject;
import io.swagger.annotations.*;
import java.util.Optional;
import javax.validation.constraints.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "daytime", description = "the daytime API")
public interface DaytimeApi {

  default Optional<NativeWebRequest> getRequest() {
    return Optional.empty();
  }

  /**
   * GET /daytime Gets the time of day.
   *
   * @return The daytime service response. (status code 200)
   */
  @ApiOperation(
      value = "",
      nickname = "dateTime",
      notes = "Gets the time of day. ",
      response = DateTimeObject.class,
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            code = 200,
            message = "The daytime service response.",
            response = DateTimeObject.class)
      })
  @GetMapping(
      value = "/daytime",
      produces = {"application/json"})
  default ResponseEntity<DateTimeObject> dateTime() {
    getRequest()
        .ifPresent(
            request -> {
              for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                  String exampleString = "{ \"date\" : \"2000-01-23T04:56:07.000+00:00\" }";
                  ApiUtil.setExampleResponse(request, "application/json", exampleString);
                  break;
                }
              }
            });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
