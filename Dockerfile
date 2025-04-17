# Start with a lightweight base image with Java
FROM openjdk:17-jdk-slim

# Set an environment variable for the app's jar file name
ENV APP_JAR=myapp-0.0.1-SNAPSHOT.jar

# Set the working directory inside the container
WORKDIR /src

# Copy the jar file from your local machine to the container
COPY target/${APP_JAR} app.jar

# Expose the port your Spring Boot app runs on (usually 8080)
EXPOSE 8080

# Set the command to run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
