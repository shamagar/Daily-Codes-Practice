package org.magar.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetingServiceImp  implements GreetingService
{
    @Override
    public String getGreeting(String name)
    {
        LocalDateTime dateTime = LocalDateTime.now();
        int hour = dateTime.getHour();

        if(hour < 12)
            return "Hello, " + name + "!"+"Have a grate morning!";
        else if(hour < 16)
            return "Hello, " + name + "!"+"Have a grate noon!";
        else if(hour < 20)
            return "Hello, " + name + "!"+"Have a grate evening!";
        else
            return "Hello, " + name + "!"+"Have a grate night!";
    }
}
