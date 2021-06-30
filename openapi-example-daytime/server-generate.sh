#! /bin/bash

SCRIPTHOME="$(cd $(dirname "$0"); pwd)"
OUTDIR=$SCRIPTHOME/server
set -e
mkdir -p $OUTDIR
java -jar $SCRIPTHOME/../bin/openapi-generator-cli.jar generate \
--package-name com.ionos.demo.daytime.server \
--input-spec $SCRIPTHOME/daytime.yaml \
-g spring \
-c $SCRIPTHOME/client-config.yaml \
-o $OUTDIR
xmlstarlet fo < $OUTDIR/pom.xml > /tmp/t && mv /tmp/t $OUTDIR/pom.xml
