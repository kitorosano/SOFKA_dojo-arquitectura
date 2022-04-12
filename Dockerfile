FROM openjdk:8-alpine
ADD target/microservicio1-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]