# Project Setup Instructions

## Requirements

To run the current backend, the following tools are required:

- Git
- Java Development Kit 21

Maven does not need to be installed separately because the project includes the Maven Wrapper.

## Clone the repository

```bash
git clone https://github.com/Luis-sanper/shared-living-platform.git
cd shared-living-platform
```

## Run the backend tests

### Windows

```bash
cd backend
mvnw.cmd test
```

### Linux or macOS

```bash
cd backend
chmod +x mvnw
./mvnw test
```

## Run the Spring Boot application

### Windows

```bash
cd backend
mvnw.cmd spring-boot:run
```

### Linux or macOS

```bash
cd backend
chmod +x mvnw
./mvnw spring-boot:run
```

The backend is currently an initial Spring Boot project structure. The application features and REST API will be implemented during the following development sprints.
