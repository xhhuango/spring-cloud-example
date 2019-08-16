package com.xhhuango.gateway;

import org.springframework.stereotype.Component;

@Component
public class ServiceFallback implements Service {
    @Override
    public String say(String name) {
        return "Oooops... Name is required.";
    }
}
