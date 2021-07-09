#! /bin/bash

SCRIPTHOME="$(cd $(dirname "$0"); pwd)"
OUTDIR=$SCRIPTHOME/server
set -e
mkdir -p $OUTDIR
export JAVA_POST_PROCESS_FILE="java -jar $SCRIPTHOME/../bin/google-java-format.jar --replace "
java -jar $SCRIPTHOME/../bin/openapi-generator-cli.jar generate \
--enable-post-process-file \
--package-name com.ionos.demo.daytime.server \
--input-spec $SCRIPTHOME/daytime.yaml \
-g spring \
-c $SCRIPTHOME/server-config.yaml \
-o $OUTDIR
