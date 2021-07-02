#! /bin/bash

SCRIPTHOME="$(cd $(dirname "$0"); pwd)"
OUTDIR=$SCRIPTHOME/client
set -e
mkdir -p $OUTDIR
export JAVA_POST_PROCESS_FILE="java -jar $SCRIPTHOME/../bin/google-java-format.jar --replace "
java -jar $SCRIPTHOME/../bin/openapi-generator-cli.jar generate \
--enable-post-process-file \
--package-name com.ionos.demo.daytime.client \
--input-spec $SCRIPTHOME/daytime.yaml \
-g java \
-c $SCRIPTHOME/client-config.yaml \
-o $OUTDIR

for FILE in $OUTDIR/pom.xml $OUTDIR/src/main/AndroidManifest.xml; do
    xmlstarlet fo < $FILE > /tmp/t && mv /tmp/t $FILE
done
