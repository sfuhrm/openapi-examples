#! /bin/bash

set -e
SCRIPTHOME="$(cd $(dirname "$0"); pwd)"
mkdir -p $SCRIPTHOME/bin

VERSION=5.1.1
wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/${VERSION}/openapi-generator-cli-${VERSION}.jar
mv openapi-generator-cli-${VERSION}.jar $SCRIPTHOME/bin/openapi-generator-cli.jar

VERSION=1.10.0
wget https://github.com/google/google-java-format/releases/download/v${VERSION}/google-java-format-${VERSION}-all-deps.jar
mv google-java-format-${VERSION}-all-deps.jar $SCRIPTHOME/bin/google-java-format.jar
