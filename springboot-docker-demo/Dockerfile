FROM openjdk:18-oracle
ARG JAR_FILE=target/springboot-docker-demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]