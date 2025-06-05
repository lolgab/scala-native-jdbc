#!/bin/bash

set -e

REPO_URL="https://github.com/com-lihaoyi/scalasql.git"
VERSION="0.1.20"
REPO_DIR="target/scalasql"
PATCH_FILE="scalasql.patch"

if [ -d "$REPO_DIR" ]; then
    echo "Repository directory already exists. Removing it first."
    rm -rf "$REPO_DIR"
fi

git clone --depth 1 --branch "$VERSION" "$REPO_URL" "$REPO_DIR"
cd "$REPO_DIR"

# Apply the patch
if [ -f "../../$PATCH_FILE" ]; then
    git apply "../../$PATCH_FILE"
    echo "Patch applied successfully."
else
    echo "Patch file not found: $PATCH_FILE"
    exit 1
fi

git add .

./mill --import "ivy:com.lihaoyi::mill-contrib-sonatypecentral:" mill.contrib.sonatypecentral.SonatypeCentralPublishModule/publishAll --publishArtifacts __.publishArtifacts
