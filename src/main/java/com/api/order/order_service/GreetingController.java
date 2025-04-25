package com.api.order.order_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello from Order Service!";
    }
}