package com.ionos.demo.daytime.openapi.api;

import java.util.Optional;
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
}
