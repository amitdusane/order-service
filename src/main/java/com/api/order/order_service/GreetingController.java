package com.api.order.order_service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingController {

    @Value("${hello.by}")
    private String helloBy;

    @GetMapping("/order/api/hello")
    public String sayHello() {
        log.info("Inside say hello");
        return "Hello from Order Service By - " + helloBy;
    }
}