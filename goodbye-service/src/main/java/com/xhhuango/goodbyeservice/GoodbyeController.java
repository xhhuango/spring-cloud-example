package com.xhhuango.goodbyeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController {
    @GetMapping("/say")
    public String sayGoodbye(@RequestParam String name) {
        return "Goodbye, " + name + "!";
    }
}
