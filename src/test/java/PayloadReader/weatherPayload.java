package PayloadReader;

import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class weatherPayload {

    public static JSONObject createWeatherStationResponse(){ //POST

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");

        return jsonObject;


    }
}
