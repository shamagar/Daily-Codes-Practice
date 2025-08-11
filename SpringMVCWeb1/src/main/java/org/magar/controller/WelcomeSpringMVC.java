package org.magar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeSpringMVC
{

    //Method ONE to get the information from the server to the user interface(UI) or Frontend with one attribute
     @RequestMapping("/welcome")
    public ModelAndView welcomeSpringMVC()
    {
        //ModelAndView provides model data along with file name, not an extension or file location
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Welcome from Spring MVC Application.");    //Model data or information
        mv.setViewName("index");            //Logical view name
        return mv;
    }

    //Method two to get the information from the server to the user interface(UI) or Frontend with two attributes
    @RequestMapping("/info")
    public ModelAndView getInfo()
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Second method to get the data or information from controller or server to frontend.");
        mv.setViewName("info");
        return mv;
    }

}
