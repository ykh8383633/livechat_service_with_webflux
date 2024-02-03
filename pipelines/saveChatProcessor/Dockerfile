FROM openjdk:17-jdk
VOLUME /tmp
ARG JAR_FILE=./build/libs/saveChatProcessor-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} saveChatProcessorApp.jar

ENTRYPOINT ["java","-jar","/saveChatProcessorApp.jar"]