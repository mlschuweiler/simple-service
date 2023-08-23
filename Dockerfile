FROM amazoncorretto:17

COPY build/libs/simple-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8083

CMD ["java", "-jar", "app.jar"]