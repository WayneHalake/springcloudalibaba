package com.example.serverconsumer.serverconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerCtr {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/templateCell")
    public String templateCell(){
        return restTemplate.getForObject("http://server-provider/provider/sayHello", String.class);
    }

}
