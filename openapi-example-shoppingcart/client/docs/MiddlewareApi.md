# MiddlewareApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCartById**](MiddlewareApi.md#deleteCartById) | **DELETE** /cart/{cartId} | 
[**getCartById**](MiddlewareApi.md#getCartById) | **GET** /cart/{cartId} | 
[**getCartItems**](MiddlewareApi.md#getCartItems) | **GET** /cart/{cartId}/items | 
[**listCarts**](MiddlewareApi.md#listCarts) | **GET** /carts | 
[**newCart**](MiddlewareApi.md#newCart) | **POST** /carts | 
[**putCartItems**](MiddlewareApi.md#putCartItems) | **PUT** /cart/{cartId}/items | 


<a name="deleteCartById"></a>
# **deleteCartById**
> ShoppingCartObject deleteCartById(cartId)



Deletes the shopping cart. 

### Example
```java
// Import classes:
import com.ionos.demo.shoppingcart.openapi.ApiClient;
import com.ionos.demo.shoppingcart.openapi.ApiException;
import com.ionos.demo.shoppingcart.openapi.Configuration;
import com.ionos.demo.shoppingcart.openapi.models.*;
import com.ionos.demo.shoppingcart.openapi.api.MiddlewareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    MiddlewareApi apiInstance = new MiddlewareApi(defaultClient);
    String cartId = "cartId_example"; // String | 
    try {
      ShoppingCartObject result = apiInstance.deleteCartById(cartId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiddlewareApi#deleteCartById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **String**|  |

### Return type

[**ShoppingCartObject**](ShoppingCartObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The shopping cart service response. |  -  |

<a name="getCartById"></a>
# **getCartById**
> ShoppingCartObject getCartById(cartId)



Gets the shopping cart. 

### Example
```java
// Import classes:
import com.ionos.demo.shoppingcart.openapi.ApiClient;
import com.ionos.demo.shoppingcart.openapi.ApiException;
import com.ionos.demo.shoppingcart.openapi.Configuration;
import com.ionos.demo.shoppingcart.openapi.models.*;
import com.ionos.demo.shoppingcart.openapi.api.MiddlewareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    MiddlewareApi apiInstance = new MiddlewareApi(defaultClient);
    String cartId = "cartId_example"; // String | 
    try {
      ShoppingCartObject result = apiInstance.getCartById(cartId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiddlewareApi#getCartById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **String**|  |

### Return type

[**ShoppingCartObject**](ShoppingCartObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The shopping cart service response. |  -  |

<a name="getCartItems"></a>
# **getCartItems**
> List&lt;ShoppingCartItem&gt; getCartItems(cartId)



Gets the shopping cart items. 

### Example
```java
// Import classes:
import com.ionos.demo.shoppingcart.openapi.ApiClient;
import com.ionos.demo.shoppingcart.openapi.ApiException;
import com.ionos.demo.shoppingcart.openapi.Configuration;
import com.ionos.demo.shoppingcart.openapi.models.*;
import com.ionos.demo.shoppingcart.openapi.api.MiddlewareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    MiddlewareApi apiInstance = new MiddlewareApi(defaultClient);
    String cartId = "cartId_example"; // String | 
    try {
      List<ShoppingCartItem> result = apiInstance.getCartItems(cartId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiddlewareApi#getCartItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **String**|  |

### Return type

[**List&lt;ShoppingCartItem&gt;**](ShoppingCartItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The shopping cart service response. |  -  |

<a name="listCarts"></a>
# **listCarts**
> List&lt;ShoppingCartObject&gt; listCarts()



Lists all shopping carts. 

### Example
```java
// Import classes:
import com.ionos.demo.shoppingcart.openapi.ApiClient;
import com.ionos.demo.shoppingcart.openapi.ApiException;
import com.ionos.demo.shoppingcart.openapi.Configuration;
import com.ionos.demo.shoppingcart.openapi.models.*;
import com.ionos.demo.shoppingcart.openapi.api.MiddlewareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    MiddlewareApi apiInstance = new MiddlewareApi(defaultClient);
    try {
      List<ShoppingCartObject> result = apiInstance.listCarts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiddlewareApi#listCarts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ShoppingCartObject&gt;**](ShoppingCartObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The shopping cart list. |  -  |

<a name="newCart"></a>
# **newCart**
> ShoppingCartObject newCart(shoppingCartObject)



Creates a new shopping cart. 

### Example
```java
// Import classes:
import com.ionos.demo.shoppingcart.openapi.ApiClient;
import com.ionos.demo.shoppingcart.openapi.ApiException;
import com.ionos.demo.shoppingcart.openapi.Configuration;
import com.ionos.demo.shoppingcart.openapi.models.*;
import com.ionos.demo.shoppingcart.openapi.api.MiddlewareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    MiddlewareApi apiInstance = new MiddlewareApi(defaultClient);
    ShoppingCartObject shoppingCartObject = new ShoppingCartObject(); // ShoppingCartObject | 
    try {
      ShoppingCartObject result = apiInstance.newCart(shoppingCartObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiddlewareApi#newCart");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shoppingCartObject** | [**ShoppingCartObject**](ShoppingCartObject.md)|  |

### Return type

[**ShoppingCartObject**](ShoppingCartObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The shopping cart service response. |  -  |

<a name="putCartItems"></a>
# **putCartItems**
> List&lt;ShoppingCartItem&gt; putCartItems(cartId)



Updates the shopping cart items. 

### Example
```java
// Import classes:
import com.ionos.demo.shoppingcart.openapi.ApiClient;
import com.ionos.demo.shoppingcart.openapi.ApiException;
import com.ionos.demo.shoppingcart.openapi.Configuration;
import com.ionos.demo.shoppingcart.openapi.models.*;
import com.ionos.demo.shoppingcart.openapi.api.MiddlewareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    MiddlewareApi apiInstance = new MiddlewareApi(defaultClient);
    String cartId = "cartId_example"; // String | 
    try {
      List<ShoppingCartItem> result = apiInstance.putCartItems(cartId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiddlewareApi#putCartItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **String**|  |

### Return type

[**List&lt;ShoppingCartItem&gt;**](ShoppingCartItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The shopping cart service response. |  -  |

