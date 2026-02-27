FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/auth-0.0.1-SNAPSHOT.jar /app/auth.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/auth.jar"]