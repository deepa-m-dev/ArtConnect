package com.example.ArtConnect.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController   // use this for API
@RequestMapping("/api")
public class ChatController {

    private final RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/chat")
    public Map<String, String> chat(@RequestBody Map<String, String> request) {

        String userMessage = request.get("message"); // ✅ get input

        // Send to Python chatbot
        Map<String, String> req = new HashMap<>();
        req.put("message", userMessage);

        ResponseEntity<Map> response = restTemplate.postForEntity(
                "http://localhost:5001/chat",
                req,
                Map.class
        );

        String reply = (String) response.getBody().get("reply");
        String mood = (String) response.getBody().get("mood");

        // return response to frontend
        Map<String, String> result = new HashMap<>();
        result.put("reply", reply);
        result.put("mood", mood);
        return result;
        
    } 
}