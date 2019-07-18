package com.xhhuango.goodbyeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController {
    @GetMapping("/say")
    public String sayGoodbye(@RequestParam(required = false) String name) {
        return name == null ? "Goodbye!" : "Goodbye, " + name + "!";
    }
}
