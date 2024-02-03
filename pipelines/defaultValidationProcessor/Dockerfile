FROM openjdk:17-jdk
VOLUME /tmp
ARG JAR_FILE=./build/libs/defaultValidationProcessor-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} defaultValidationProcessorApp.jar

ENTRYPOINT ["java","-jar","/defaultValidationProcessorApp.jar"]