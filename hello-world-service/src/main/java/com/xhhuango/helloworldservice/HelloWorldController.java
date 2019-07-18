package com.xhhuango.helloworldservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/say")
    public String sayHelloWorld(@RequestParam String name) {
        return "Hello World, " + name + "!";
    }
}
