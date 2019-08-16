package com.xhhuango.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AppController {
    @Resource
    private Service service;

    @GetMapping("/doSay")
    public String say(@RequestParam(required = false) String name) {
        return service.say(name);
    }
}
