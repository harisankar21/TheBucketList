package com.online.TravelList.travelcore;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.logging.Logger;
@RestController
public class TravelCoreController {
public static Logger logger;
    @RequestMapping(value="gettravelList",produces = "application/json")
    public static TravelResponse getTravelList(){
        TravelResponse travelResponse= new TravelResponse();
        JSONObject jsonObject=new JSONObject();
        travelResponse.setData(jsonObject);
        travelResponse.setStatus("sucess");
        return travelResponse;
    }

    @RequestMapping(value="addtravellocation",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public static TravelResponse addTravelList(@RequestBody String input) throws ParseException {
        logger.info("data");
        JSONObject inputJson=(JSONObject) new JSONParser().parse(input);;
        logger.info("data"+inputJson.toJSONString());
        TravelResponse travelResponse= new TravelResponse();
        travelResponse.setData(inputJson);
        travelResponse.setStatus("sucess");
        return travelResponse;
    }

    @RequestMapping(value="deletetravellocation/{id}",method = RequestMethod.DELETE,consumes = "application/json",produces = "application/json")
    public static TravelResponse deleteTravelList() throws ParseException {
        TravelResponse travelResponse= new TravelResponse();
        return travelResponse;
    }


}
