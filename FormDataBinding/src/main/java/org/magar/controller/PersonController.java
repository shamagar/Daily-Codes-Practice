package org.magar.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.magar.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class PersonController {

    //Url for Registration page
    @GetMapping("/register")
    public String registerPage()
    {
        return "register";
    }

    //The other way, but it is not recommended because it requires writing a request.getParameter each time and parsing
    //Url for Response page using HttpServletRequest
    /*
    @GetMapping("/reg")
    public String getRegisterPage(Map<String, Object> map, HttpServletRequest request)
    {
        Person person = new Person();
        request.getParameter("id");
        request.getParameter("firstName");
        request.getParameter("lastName");
        request.getParameter("city");
        request.getParameter("salary");
        map.put("personDetails",person);
        return "response";
    }
     */

    //Url for Response
    @PostMapping("/register")
    public String getPersonInfo(Map<String, Object> map, @ModelAttribute("info") Person person)
    {
        map.put("info", person);
        return "response";
    }
}
