# -------- Stage 1: Build --------
FROM maven:3.9.6-eclipse-temurin-17 AS builder

# Set working directory
WORKDIR /build

# Copy project files
COPY pom.xml .
COPY src ./src

# Build jar
RUN mvn clean package -DskipTests


# -------- Stage 2: Run --------
FROM eclipse-temurin:17-jdk-jammy

# Create app directory
WORKDIR /app

# Copy jar from builder stage
COPY --from=builder /build/target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]
