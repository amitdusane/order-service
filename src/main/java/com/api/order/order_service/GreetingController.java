package com.api.order.order_service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingController {

    @GetMapping("/api/hello")
    public String sayHello() {
        log.info("Inside sayhello");
        return "Hello from Order Service!";
    }
}