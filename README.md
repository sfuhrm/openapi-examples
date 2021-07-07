# OpenAPI Examples

Some simple examples to show the usage of the OpenAPI specification.

Code generation is done using the [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator).

Reformatting the generated code is done using the
[Google Formatter](https://github.com/google/google-java-format/).

## Requirements

* Linux with Bash shell
* [JDK 11+](https://adoptopenjdk.net/)
* [Apache Maven 3.8+](https://maven.apache.org/download.cgi)

## Setup

* Download the OpenAPI Generator and Google Formatter:

```bash
./download.sh
```

* Then create the files you need using one of the scripts
  in the sub folders.

## Examples

### Daytime service

The service is inspired by the [daytime protocol](https://en.wikipedia.org/wiki/Daytime_Protocol),
but is not intended to replace it or use the date formats of that protocol.

The API documentation can be viewed [here](https://app.swaggerhub.com/apis-docs/sfuhrm.de/Daytime/0.0.3).

### Shopping cart service

A simple shopping cart that can be accessed using HTTP.

The API documentation can be viewed [here](https://app.swaggerhub.com/apis-docs/sfuhrm.de/ShoppingCart/0.1.0).

## License

This content is licensed under [GPL 3.0](LICENSE.txt).
