package org.magar.springbootapiintegration.rest;

import org.magar.springbootapiintegration.service.WhatsappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class WhatsappController
{
    //@Autowired
    private WhatsappService service;

    //Constructor
    public WhatsappController()
    {
        this.service = service;
    }

    //Api to send message
    @GetMapping("/send-message")
    public String sendMessage(@RequestParam String phoneNumber,@RequestParam String templateName,@RequestParam String templateParameters)
    {
        return service.sendTemplateMessage(phoneNumber, templateName, Arrays.asList(templateParameters));
    }
}
