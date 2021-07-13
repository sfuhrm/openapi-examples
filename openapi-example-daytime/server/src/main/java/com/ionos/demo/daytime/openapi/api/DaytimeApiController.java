package com.ionos.demo.daytime.openapi.api;

import java.time.OffsetDateTime;
import java.util.Optional;

import com.ionos.demo.daytime.openapi.model.DateTimeObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("${openapi.daytime.base-path:/api}")
public class DaytimeApiController implements DaytimeApi {

  private final NativeWebRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public DaytimeApiController(NativeWebRequest request) {
    this.request = request;
  }

  @Override
  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  @Override
  public ResponseEntity<DateTimeObject> dateTime() {
    DateTimeObject dateTimeObject  = new DateTimeObject();
    dateTimeObject.setDate(OffsetDateTime.now());
    return new ResponseEntity<>(dateTimeObject, HttpStatus.OK);
  }
}
