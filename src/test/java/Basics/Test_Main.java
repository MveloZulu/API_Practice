package Basics;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_Main {
    public  static  void main(String[] args) {

    RestAssured.baseURI = "https://dog.ceo/api/";

    Response response = RestAssured.given().
            when().
            get("breeds/list/all").
            then().log().all().//print the response in the console
            statusCode(200).
            extract().response();//response that we will get


        
}
}
