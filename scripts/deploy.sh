#!/bin/bash
REPOSITORY=/home/ec2-user/app
BUILD_PATH=$(ls /home/ec2-user/app/*SNAPSHOT.jar)
JAR_NAME=$(basename $BUILD_PATH)
IDLE_APPLICATION_PATH=/home/ec2-user/app/${JAR_NAME}
TARGET_PORT=8080

CURRENT_PID=$(lsof -Fp -i TCP:${TARGET_PORT} | grep -Po 'p[0-9]+' | grep -Po '[0-9]+')
sudo kill ${TARGET_PORT}

nohup java -jar -Duser.timezone=Asia/Seoul -Dserver.port=${TARGET_PORT} -Dspring.profiles.active=dev $IDLE_APPLICATION_PATH >> /home/ec2-user/app/nohup.out 2>&1 &
