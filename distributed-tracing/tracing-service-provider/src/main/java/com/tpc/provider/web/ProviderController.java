package com.tpc.provider.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @GetMapping("/called")
    public String called(@RequestParam String param){
        return "You called me with param: " + param;
    }
}

