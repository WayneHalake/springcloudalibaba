package com.example.serverprovider.controller;

import com.example.serverprovider.service.ProviderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderCtr {

    @Autowired
    private ProviderSer providerSer;

    @GetMapping("/sayHello")
    public String sayHello(){
        return providerSer.sayHello();
    }

}
