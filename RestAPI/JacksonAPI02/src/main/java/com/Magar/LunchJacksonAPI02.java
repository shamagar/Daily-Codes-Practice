package com.Magar;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class LunchJacksonAPI02
{
    public static void main(String[] args)
    {
        //Create the object of ObjectMappper
        ObjectMapper mapper = new ObjectMapper();

        //Converting Json to Java object
        try
        {
            Alien alien = mapper.readValue(new File("json/sample-complex.json"), Alien.class);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
