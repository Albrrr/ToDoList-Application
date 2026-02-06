#!/usr/bin/env bash
set -euo pipefail

repo_dir="$(cd "$(dirname "$0")" && pwd)"
app_dir="${repo_dir}/Application"
build_dir="${app_dir}/build"

rm -rf "${build_dir}"
mkdir -p "${build_dir}"

javac -d "${build_dir}" "${app_dir}/Lists.java" "${app_dir}/ToDoList.java"

if [[ -f "${app_dir}/taskComplete.png" ]]; then
  cp "${app_dir}/taskComplete.png" "${build_dir}/"
fi

jar cfe "${app_dir}/ToDoList.jar" ToDoList -C "${build_dir}" .
