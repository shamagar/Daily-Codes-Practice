//Demonstration on Query Param for single and multiple data
package org.magar.queryparam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLOutput;
import java.util.Map;

@Controller
public class ControllerForQueryParam
{
    //For single data: http://localhost:8585/QueryParamApp/info?name=Bill
    @GetMapping("/info")
    public String getInfo(@RequestParam("name") String n, Map<String, Object> map)
    {
        //Debug propose
        System.out.println(n);

        map.put("information", "Hello! "+n+" I hope you are fine and this is a Query Param demonstration.");
        return "index";
    }

    //For multiple data:http://localhost:8585/QueryParamApp/info?name=Bill&course=RestApi
    @GetMapping("/info1")
    public String getMoreInfo(@RequestParam("name") String n, @RequestParam("course") String course, Map<String, Object> map)
    {
        map.put("information", "Hello! "+n+" I hope you are fine and enjoying "+course +" every week.");
        return "index";
    }
}
