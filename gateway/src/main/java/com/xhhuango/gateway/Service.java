package com.xhhuango.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service", fallback = ServiceFallback.class)
public interface Service {
    @GetMapping("/say")
    String say(@RequestParam("name") String name);
}
