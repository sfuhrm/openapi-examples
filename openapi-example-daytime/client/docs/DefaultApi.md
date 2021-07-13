# DefaultApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dateTime**](DefaultApi.md#dateTime) | **GET** /daytime | 


<a name="dateTime"></a>
# **dateTime**
> DateTimeObject dateTime()



Gets the time of day. 

### Example
```java
// Import classes:
import com.ionos.demo.daytime.openapi.ApiClient;
import com.ionos.demo.daytime.openapi.ApiException;
import com.ionos.demo.daytime.openapi.Configuration;
import com.ionos.demo.daytime.openapi.models.*;
import com.ionos.demo.daytime.openapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      DateTimeObject result = apiInstance.dateTime();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#dateTime");
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

[**DateTimeObject**](DateTimeObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The daytime service response. |  -  |

