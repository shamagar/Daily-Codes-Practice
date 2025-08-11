//Using war file while creating the application
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/c1")
public class FirstController
{
    @GetMapping("/get")
    public String getInfo(Model model)
    {
        //Displaying the class name
        System.out.println("Model is implemented by  "+model.getClass().getSimpleName());

        //Model Data or information
        model.addAttribute("method3", "Third method to get information from server to frontend using only model.");
        return "thirdMethod";       //Logical View Name

    }

    @GetMapping("/info")
    public String info(Model model)
    {
        //Model info
        model.addAttribute("content", "Java, Spring Boot and Spring MVC ");
        return "/topic.jsp";                         //Logical View Name
    }

    //Using Map
    @GetMapping("/message")
    public String getMoreInfo(Map<String, Object> map)
    {
        //Model data along with key
        map.put("focus", "Focus is the key to mastering any skills");
        return "focus"; //LVN
    }

    //If the logical view file name is the same as the URL, then we don't have to write  the view file name
    @GetMapping("/alien")
    public void moreInfo(Map<String, Object> map)
    {
        //Model data along with key
        map.put("word", "Welcome to Spring MVC course, Alien");
        return ;
    }
}
