#!/bin/bash

set -e

REPO_URL="https://github.com/AugustNagro/magnum.git"
VERSION="1.3.1"
REPO_DIR="target/magnum"
PATCH_FILE="magnum.patch"

if [ -d "$REPO_DIR" ]; then
    echo "Repository directory already exists. Removing it first."
    rm -rf "$REPO_DIR"
fi

git clone --depth 1 --branch "v$VERSION" "$REPO_URL" "$REPO_DIR"
cd "$REPO_DIR"

# Apply the patch
if [ -f "../../$PATCH_FILE" ]; then
    git apply "../../$PATCH_FILE"
    echo "Patch applied successfully."
else
    echo "Patch file not found: $PATCH_FILE"
    exit 1
fi

GITHUB_REF=refs/tags/1.3.1 sbt ci-release
