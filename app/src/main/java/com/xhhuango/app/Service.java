package com.xhhuango.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service")
public interface Service {
    @GetMapping("/say")
    String say(@RequestParam("name") String name);
}
