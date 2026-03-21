package org.magar.springbootapiintegration.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WhatsappService
{
    //Method one to provide wati information
   // private String url = "https://app-server.wati.io/api/v1/sendTemplateMessage";

    //Method two to provide wati information which is in application.properties file
    //we need to use @Value annotation along with $ and key same as in that file
    @Value("${wati.api.url}")
    private String url;

    @Value("${wati.api.token}")
    private String token;

    //Creating RestTemplate object
    private RestTemplate restTemplate = new RestTemplate();

    //Method to send the template message
    public String sendTemplateMessage(String phoneNumber, String templateName, List<String> templateParameters)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);
        headers.set("Content-Type", "application/json");

        //For Body information
        Map<String, Object> body = new HashMap<>();
        body.put("phone", phoneNumber);
        body.put("templateName", templateName);
        body.put("parameters", templateParameters);

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(body, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        return response.getBody();
    }
}
