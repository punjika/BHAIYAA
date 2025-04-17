# Use lightweight Java image
FROM openjdk:17-jdk-slim

# App jar name (adjust if needed)
ARG JAR_FILE=target/*.jar

# Create app directory
WORKDIR /app

# Copy jar file into the container
COPY ${JAR_FILE} app.jar

# Expose the app port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
