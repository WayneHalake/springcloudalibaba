package com.example.serverprovider.controller;

import com.example.serverprovider.service.ProviderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
@RefreshScope
public class ProviderCtr {

    @Autowired
    private ProviderSer providerSer;

    /**
     * 获取nacos配置中心 配置config.testLabel的值
     * 注意‘:’ 不能少
     */
    @Value("${config.testLabel:}")
    private String testLabel;

    @GetMapping("/sayHello")
    public String sayHello(){
        return providerSer.sayHello();
    }

    /**
     * 获取Nacos注册中心配置信息
     * @return
     */
    @GetMapping("/getNacosConfig")
    public String getNacosConfig(){
        return testLabel;
    }

}
