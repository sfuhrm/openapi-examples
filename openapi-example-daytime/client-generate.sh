#! /bin/bash

SCRIPTHOME="$(cd $(dirname "$0"); pwd)"
OUTDIR=$SCRIPTHOME/client
set -e
mkdir -p $OUTDIR
java -jar $SCRIPTHOME/../bin/openapi-generator-cli.jar generate \
--package-name com.ionos.demo.daytime.client \
--input-spec $SCRIPTHOME/daytime.yaml \
-g java \
-c $SCRIPTHOME/server-config.yaml \
-o $OUTDIR

xmlstarlet fo < $OUTDIR/pom.xml > /tmp/t && mv /tmp/t $OUTDIR/pom.xml

xmlstarlet fo < $OUTDIR/src/main/AndroidManifest.xml > /tmp/t && mv /tmp/t $OUTDIR/src/main/AndroidManifest.xml
