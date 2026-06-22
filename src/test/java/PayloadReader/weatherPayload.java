package PayloadReader;

import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class weatherPayload {

    public static JSONObject createWeatherStationResponse(){ //POST

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");
        jsonObject.put("name", "San Francisco Test Station");
        jsonObject.put("latitude",37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);

        return jsonObject;
    }
    public static JSONObject createWeatherStationResponseEmpty(){ //POST

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");
        jsonObject.put("name", "");
        jsonObject.put("latitude",37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);

        return jsonObject;
    }

    public static JSONObject updateWeatherStationResponse(){ //PUT

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");
        jsonObject.put("name", "San Nomvelo Test Station");
        jsonObject.put("latitude",37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);

        return jsonObject;
    }

    public static JSONObject readWeatherStationResponse(){ //GET

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");
        jsonObject.put("name", "San Nomvelo Test Station");
        jsonObject.put("latitude",37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);

        return jsonObject;
    }

    public static JSONObject deleteWeatherStationResponse(){ //DELETE

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");
        jsonObject.put("name", "San Nomvelo Test Station");
        jsonObject.put("latitude",37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);

        return jsonObject;
    }
}
