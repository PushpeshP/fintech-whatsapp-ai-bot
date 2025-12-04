package com.fintech.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @GetMapping("/api/webhook")
    public String webhook() {
        return "Webhook is working!";
    }
}
