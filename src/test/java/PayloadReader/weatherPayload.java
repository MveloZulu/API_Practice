package PayloadReader;

import Common.TestDataGenerator;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class weatherPayload {

    static Double latitudeNo = Double.valueOf(TestDataGenerator.latitude);
    static Double longitudeNo = Double.valueOf(TestDataGenerator.longitude);
    static int altitudeNo = Integer.valueOf(TestDataGenerator.altitude);
    public static JSONObject createWeatherStationResponse(){ //POST

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");
        jsonObject.put("name", "San Francisco Test Station");
        jsonObject.put("latitude",latitudeNo);
        jsonObject.put("longitude", longitudeNo);
        jsonObject.put("altitude", altitudeNo);

        return jsonObject;
    }
    public static JSONObject createWeatherStationResponseEmpty(){ //POST

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");
        jsonObject.put("name", "");
        jsonObject.put("latitude",latitudeNo);
        jsonObject.put("longitude", longitudeNo);
        jsonObject.put("altitude", altitudeNo);

        return jsonObject;
    }

    public static JSONObject updateWeatherStationResponse(){ //PUT

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");
        jsonObject.put("name", "San Nomvelo Test Station");
        jsonObject.put("latitude",latitudeNo);
        jsonObject.put("longitude", longitudeNo);
        jsonObject.put("altitude", altitudeNo);

        return jsonObject;
    }

    public static JSONObject readWeatherStationResponse(){ //GET

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");
        jsonObject.put("name", "San Nomvelo Test Station");
        jsonObject.put("latitude",latitudeNo);
        jsonObject.put("longitude", longitudeNo);
        jsonObject.put("altitude", altitudeNo);

        return jsonObject;
    }

    public static JSONObject deleteWeatherStationResponse(){ //DELETE

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SA_DUR104");
        jsonObject.put("name", "San Nomvelo Test Station");
        jsonObject.put("latitude",latitudeNo);
        jsonObject.put("longitude", longitudeNo);
        jsonObject.put("altitude", altitudeNo);

        return jsonObject;
    }
}
