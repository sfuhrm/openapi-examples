#! /bin/bash

SCRIPTHOME="$(cd $(dirname "$0"); pwd)"
OUTDIR=$SCRIPTHOME/server
set -e
mkdir -p $OUTDIR
export JAVA_POST_PROCESS_FILE="java -jar $SCRIPTHOME/../bin/google-java-format.jar --replace "
java -jar $SCRIPTHOME/../bin/openapi-generator-cli.jar generate \
--enable-post-process-file \
--package-name com.ionos.demo.shoppingcart.server \
--input-spec $SCRIPTHOME/shoppingcart.yaml \
-g spring \
-c $SCRIPTHOME/server-config.yaml \
-o $OUTDIR

xmlstarlet fo < $OUTDIR/pom.xml > /tmp/t && mv /tmp/t $OUTDIR/pom.xml
