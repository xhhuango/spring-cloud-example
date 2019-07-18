package com.xhhuango.helloworldservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/say")
    public String sayHelloWorld(@RequestParam(required = false) String name) {
        return name == null ? "Hello World!" : "Hello World, " + name + "!";
    }
}
