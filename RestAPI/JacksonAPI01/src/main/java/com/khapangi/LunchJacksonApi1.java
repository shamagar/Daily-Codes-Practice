//This code is demonstration on to convert Java Object into json format by adding Jackson dependency in a prom file
package com.khapangi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class LunchJacksonApi1
{
    public static void main(String[] args)
    {
        //Initializing the Alien class
        Alien a1 = new Alien();
        a1.setId(1);
        a1.setName("Alien");
        a1.setCity("Saginaw");

        Alien a2 = new Alien();
        a2.setId(2);
        a2.setName("Shayan");
        a2.setCity("Dallas");

        Alien a3 = new Alien();
        a3.setId(3);
        a3.setName("Frizzel");
        a3.setCity("Haslet");

        //Printing in a list
        List<Alien> alienList = new ArrayList<>();
        alienList.add(a1);
        alienList.add(a2);
        alienList.add(a3);

        System.out.println(alienList);

        System.out.println("****************");

        //Initializing the ObjectMapper class to convert into json format
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            //It prints in a single line
            //String jsonFormat = mapper.writeValueAsString(alienList);

            //For better readable
            String jsonFormat = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(alienList);
            System.out.println(jsonFormat);
        }
        catch (JsonProcessingException e)
        {
            throw new RuntimeException(e);
        }
    }
}
