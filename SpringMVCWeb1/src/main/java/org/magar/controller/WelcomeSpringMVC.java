package org.magar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeSpringMVC
{

    @RequestMapping("/welcome")
    public ModelAndView welcomeSpringMVC()
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Wel come from Spring MVC");
        mv.setViewName("index");
        return mv;
    }

}
