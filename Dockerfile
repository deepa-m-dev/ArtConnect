# Use OpenJDK 17 as base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy Maven wrapper and project files
COPY . .

# Build the Spring Boot project
RUN ./mvn clean package -DskipTests

# Expose port
EXPOSE 8080

# Run the Spring Boot jar
CMD ["java", "-jar", "target/ArtConnect-0.0.1-SNAPSHOT.jar"]
 
