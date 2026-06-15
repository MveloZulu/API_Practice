# API_Practice

## Description
This project demonstrates the use of the **Rest-Assured** library for API testing in Java. It includes a simple example of making a GET request to the Dog API (`https://dog.ceo/api/`) to retrieve a list of all dog breeds.

## Technologies Used
- **Java** (Version 21)
- **Maven** (Build tool)
- **Rest-Assured** (API testing library)

## Prerequisites
- Java Development Kit (JDK) 21 or higher
- Maven installed
- IntelliJ IDEA or any other IDE for Java development

## Project Structure
- `src/test/java/Basics/Test_Main.java`: Contains the main class for testing the Dog API.
- `pom.xml`: Maven configuration file with dependencies.
- `.gitignore`: Specifies files and directories to be ignored by Git.

## Dependencies
The project uses the following dependency:
- **Rest-Assured**: Version 6.0.0

```xml
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>6.0.0</version>
    <scope>test</scope>
</dependency>