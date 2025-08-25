package org.magar.pathparamconcept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class PathParamApp
{
    @GetMapping("/info1/{name}")     //For single data
    public String getDetails(@PathVariable("name") String name, Map<String, Object> map)
    {
        map.put("name", "Hello! "+name+", I hope you are fine and this is Path Param.");
        return "index";
    }

    //For multiple data
    @GetMapping("/info2/{name}/{course}")
    public String getMoreInfo(@PathVariable("name") String name, @PathVariable("course") String course, Map<String, Object> map)
    {
        map.put("name", "Hello! "+name+", I hope you are enjoying "+course+" every weekday.");
        return "index";
    }

}
