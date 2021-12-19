package com.online.TravelList.travelcore;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class TravelResponse {

    String status;
    JSONObject data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

}
