FROM openjdk:17

VOLUME /tmp

EXPOSE 8081

ARG JAR_FILE=build/libs/project3a-1.0.1.jar

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]