package com.xhhuango.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AppController {
    @Resource
    private Service service;

    @GetMapping("/doSay")
    public String say() {
        return service.say("Wayne");
    }
}
