package RequestBuilder;

import io.restassured.response.Response;

import static Common.BasePaths.WeatherURL;
import static PayloadReader.weatherPayload.createWeatherStationResponse;
import static io.restassured.RestAssured.given;

public class weatherRequest {
    public  static Response createWeatherStationRequest() {
        Object API_Key = "bc35408a5a9460f72d8af2c28fde22d1";

        return given().
                contentType("application/json").
                when().
                queryParam("appid",API_Key).
                body(createWeatherStationResponse()).
                log().all().
                post(WeatherURL + "/data/3.0/stations").
                then().
                extract().
                response();

    }
}
