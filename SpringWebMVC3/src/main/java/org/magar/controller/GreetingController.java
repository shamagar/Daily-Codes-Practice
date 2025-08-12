package org.magar.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.magar.service.GreetingService;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/con")
public class GreetingController
{
    private GreetingService greetingService;

    //Constructor injection
    public GreetingController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }


    //First Method
    @GetMapping("/greeting1")
    public String getGreeting1(Model model)
    {
        //String str = greetingService.getGreeting("Shayan");
        //model.addAttribute("greeting", str);

        //Model data
        model.addAttribute("person", greetingService.getGreeting("Shayan"));
        return "greeting";      //Logical file name
    }

    //Second Method
    @GetMapping("/greeting")
    public void getGreet(Map<String , Object> map)
    {
        map.put("person", greetingService.getGreeting("Frizzel"));
        return;
    }

    //Third method
    @GetMapping("/greet1")
    public Map<String, Object> getMoreGreet()
    {
        Map<String, Object> map = new HashMap<>();
        map.put("content", greetingService.getGreeting("Shamina"));
        return map;
    }

    //Fourth Method using PrintWriter(Response Directly from Server)
    @GetMapping("/greeting2")
    public void getWish(HttpServletResponse response)
    {
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, this is response directly coming from  controller using servlets"+greetingService.getGreeting("Deepanjali")+"</h1>");

    }
}
