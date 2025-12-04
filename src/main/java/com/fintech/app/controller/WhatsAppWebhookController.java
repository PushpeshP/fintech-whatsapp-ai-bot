package com.fintech.app.controller;

import org.springframework.web.bind.annotation.*;
import org.json.JSONObject;

@RestController
@RequestMapping("/webhook")
public class WhatsAppWebhookController {

    @GetMapping
    public String verify(@RequestParam("hub.mode") String mode,
                         @RequestParam("hub.challenge") String challenge,
                         @RequestParam("hub.verify_token") String token){
        if("test123".equals(token)) return challenge;
        return "Invalid token";
    }

    @PostMapping
    public String receive(@RequestBody String body){
        System.out.println("Incoming: "+body);
        return "EVENT_RECEIVED";
    }
}
