FROM openjdk:8-jdk-alpine

FROM mysql:8

EXPOSE 8080

ARG JAR_FILE

COPY ${JAR_FILE} app.jar

VOLUME /tmp

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
