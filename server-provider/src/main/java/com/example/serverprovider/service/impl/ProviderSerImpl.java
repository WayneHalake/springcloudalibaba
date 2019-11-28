package com.example.serverprovider.service.impl;

import com.example.serverprovider.service.ProviderSer;
import org.springframework.stereotype.Service;

@Service
public class ProviderSerImpl implements ProviderSer {
    @Override
    public String sayHello() {
        return "hello！";
    }
}
