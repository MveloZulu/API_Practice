package Tests.weather;

import RequestBuilder.weatherRequest;
import jdk.jfr.Description;
import org.testng.annotations.Test;

@Test
public class weatherTest {

    @Description("As an API user, I want to send post request that will create new weather station")
    public void createWeatherTest(){
        weatherRequest.createWeatherStationRequest().
                then().
                log().all().
                assertThat().
                statusCode(201);
    }
    @Description("As an API user, I want to send get request that will update weather station details")
    public void updateWeatherTest(){
        weatherRequest.updateWeatherStationRequest().
                then().
                log().all().
                assertThat().
                statusCode(200);
    }
}
