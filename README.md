# API_Practice

## Description
This project demonstrates the use of the **Rest-Assured** library for API testing in Java. It includes examples of making API requests to test various endpoints, including the Dog API (`https://dog.ceo/api/`) and a weather station API. The project covers creating, updating, retrieving, and deleting weather station data using RESTful API calls.

## Technologies Used
- **Java** (Version 21)
- **Maven** (Build tool)
- **Rest-Assured** (API testing library)
- **TestNG** (Testing framework)

## Prerequisites
- Java Development Kit (JDK) 21 or higher
- Maven installed
- IntelliJ IDEA or any other IDE for Java development

## Project Structure
- `src/test/java/Basics/Test_Main.java`: Contains the main class for testing the Dog API.
- `src/test/java/Tests/weather/weatherTest.java`: Contains test cases for creating, updating, retrieving, and deleting weather station data.
- `src/main/java/RequestBuilder/weatherRequest.java`: Contains methods to build and send API requests for the weather station API.
- `pom.xml`: Maven configuration file with dependencies.
- `.gitignore`: Specifies files and directories to be ignored by Git.

## Test Cases
### Dog API
- **GET Request**: Retrieves a list of all dog breeds from the Dog API.

### Weather Station API
- **POST Request**: Creates a new weather station.
- **GET Request**: Updates weather station details.
- **GET Request**: Retrieves weather station details.
- **DELETE Request**: Deletes a weather station.

## Dependencies
The project uses the following dependencies:
- **Rest-Assured**: Version 6.0.0
- **TestNG**: Version 7.8.0

```xml
<dependencies>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>6.0.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.8.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>