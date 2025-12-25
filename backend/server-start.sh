#!/bin/bash


echo "Clearing the previous log files"
rm -r *.log

echo "Starting the backend server"
./gradlew classes --watch-fs -t > compile.log 2>&1 &
./gradlew bootRun > build.log 2>&1 &
echo "Backend server started successfully and set to watch to changes"

