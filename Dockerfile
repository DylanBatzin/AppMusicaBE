FROM openjdk:17-slim

WORKDIR /app

COPY target/apiapp-0.0.1-SNAPSHOT.jar /app/apiapp.jar

EXPOSE 3000

CMD ["java", "-jar", "/app/apiapp.jar"]