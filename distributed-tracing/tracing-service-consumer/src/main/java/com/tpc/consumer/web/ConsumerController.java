package com.tpc.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/call")
    public String call(@RequestParam String param){
        return restTemplate.getForObject("http://localhost:8082/called?param=" + param,String.class);
    }
}
