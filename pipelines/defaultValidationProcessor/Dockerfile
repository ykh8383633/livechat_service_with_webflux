FROM openjdk:17-jdk
VOLUME /tmp
ARG JAR_FILE=./build/libs/defaultValidationProcessor-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} defaultValidationProcessorApp.jar

ENTRYPOINT ["java","-jar","/defaultValidationProcessorApp.jar"]