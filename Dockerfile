# Use the Maven 3.9.3 with Eclipse Temurin 17 JDK for the build stage
FROM maven:3.9.3-eclipse-temurin-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the entire project into the container
COPY . .

# Run Maven to build the project and package it into a jar file
RUN mvn clean install

# Use the OpenJDK 21 image with JDK for the runtime stage
FROM openjdk:21-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the jar file from the Maven build stage
COPY --from=build /app/target/*.jar /app/app.jar

# Expose the port your application runs on
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "app.jar"]
