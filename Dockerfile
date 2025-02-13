FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/api-0.0.1-SNAPSHOT.jar /app/crud-angular-api.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/crud-angular-api.jar"]