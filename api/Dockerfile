FROM openjdk:17-jdk
VOLUME /tmp
ARG JAR_FILE=./build/libs/api-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} apiApp.jar

ENTRYPOINT ["java","-jar","/apiApp.jar"]