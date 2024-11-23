FROM eclipse-temurin:17
COPY target/fashion.jar fashion.jar
CMD ["java", "-jar", "fashion.jar"]