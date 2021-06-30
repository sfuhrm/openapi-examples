# OpenAPI Example: Daytime

This is a kind of 'hello world' example showing the REST client and server
code generation using the [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator).

The service is inspired by the [daytime protocol](https://en.wikipedia.org/wiki/Daytime_Protocol),
but is not intended to replace it or use the date formats of that protocol.

## Overview

There are multiple files:

* 0-openapi-helloworld.yml: A very simple REST service.
* 1-openapi-inlineobject.yml: Introduction of an additional pseudo precision field.
* 2-openapi-datetimeobject.yaml: Moving the response object from inline to a schema component.

## Requirements

* Linux with Bash shell
* [JDK 11+](https://adoptopenjdk.net/)
* [Apache Maven 3.8+](https://maven.apache.org/download.cgi)

## Setup

* Download the openapi generator:

```bash
./download.sh
```

## License

This content is licensed under [GPL 3.0](LICENSE.txt).
