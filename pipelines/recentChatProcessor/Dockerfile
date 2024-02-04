FROM openjdk:17-jdk
VOLUME /tmp
ARG JAR_FILE=./build/libs/recentChatProcessor-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} recentChatProcessorApp.jar

ENTRYPOINT ["java","-jar","/recentChatProcessorApp.jar"]