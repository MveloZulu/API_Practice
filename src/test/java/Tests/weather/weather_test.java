package Tests.weather;

import RequestBuilder.weatherRequest;
import jdk.jfr.Description;
import org.testng.annotations.Test;

@Test
public class weather_test {

    @Description("As an API user, I want to send post request that will create new weather station")
    public void createWeatherTest(){
        weatherRequest.createWeatherStationRequest().
                then().
                log().all().
                assertThat().
                statusCode(200);
    }
}
