#!/bin/bash




# echo "Starting the backend server"

# ./gradlew build --continuous | tee build.log &
# BUILD_PID=$!

# # Wait until the first successful build
# grep -q "BUILD SUCCESSFUL" <(tail -f build.log)

# ./gradlew bootRun > dev.log 2>&1 &

# echo "Backend server started successfully and watching for changes"


echo "Starting the backend server"
./gradlew build --continuous > build.log 2>&1 &
./gradlew bootRun > dev.log 2>&1 &
echo "Backend server started successfully and set to watch to changes"

