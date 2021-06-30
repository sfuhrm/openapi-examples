#! /bin/bash

set -e
SCRIPTHOME="$(cd $(dirname "$0"); pwd)"
mkdir -p $SCRIPTHOME/bin

wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/5.1.1/openapi-generator-cli-5.1.1.jar
mv openapi-generator-cli-*.jar $SCRIPTHOME/bin/openapi-generator-cli.jar

wget https://github.com/google/google-java-format/releases/download/v1.10.0/google-java-format-1.10.0-all-deps.jar
mv google-java-format-1.10.0-all-deps.jar $SCRIPTHOME/bin/google-java-format.jar
