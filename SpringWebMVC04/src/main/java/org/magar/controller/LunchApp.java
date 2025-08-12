//These codes demonstration on how to display the data from array using jsp
package org.magar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class LunchApp
{
    //URl for home page
    @GetMapping("/home")
    public String showHomePage()
    {
        System.out.println("Home");
        return "home";
    }
    //URL for to get Response
    @GetMapping("/response")
    public String getResponse(Model model)
    {
        String books[] = new String[] {"Java", "C++", "Python", "C#", "Golang", "Rust", "SQL"};
        model.addAttribute("bookSet", books);

        //ForDebug
        for(String book : books)
        {
            System.out.println(book);
        }
        return "response";
    }
}
