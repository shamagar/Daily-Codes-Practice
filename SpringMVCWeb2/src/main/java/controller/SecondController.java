package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c2")
public class SecondController
{
    @GetMapping("/info1")
    public String getMoreData(Model model)
    {
        model.addAttribute("note", "Without focus you cannot master anything. ");
        return "focus";
    }
}
