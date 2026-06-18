package RequestBuilder;

import io.restassured.response.Response;

import static Common.BasePaths.WeatherURL;
import static PayloadReader.weatherPayload.createWeatherStationResponse;
import static PayloadReader.weatherPayload.updateWeatherStationResponse;
import static io.restassured.RestAssured.given;

public class weatherRequest {

    private static final String API_Key = "bc35408a5a9460f72d8af2c28fde22d1";

    public static String stationId;

    public  static Response createWeatherStationRequest() {


        Response response = given().
                contentType("application/json").
                when().
                queryParam("appid",API_Key).
                body(createWeatherStationResponse()).
                log().all().
                post(WeatherURL + "/data/3.0/stations").
                then().
                extract().
                response();

        stationId = response.jsonPath().getString("ID");
        return  response;
    }
    public static Response updateWeatherStationRequest(){
        Response response = given().
                contentType("application/json").
                when().
                queryParam("appid",API_Key).
                body(updateWeatherStationResponse()).
                log().all().
                put(WeatherURL + "/data/3.0/stations/" + stationId).
                then().
                extract().
                response();

        stationId = response.jsonPath().getString("ID");
        return response;

    }
}
