package com.ionos.demo.shoppingcart.openapi.api;

import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("${openapi.shoppingCart.base-path:/api}")
public class CartsApiController implements CartsApi {

  private final NativeWebRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public CartsApiController(NativeWebRequest request) {
    this.request = request;
  }

  @Override
  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }
}
