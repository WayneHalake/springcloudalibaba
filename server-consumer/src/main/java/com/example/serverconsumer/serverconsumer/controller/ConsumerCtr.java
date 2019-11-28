package com.example.serverconsumer.serverconsumer.controller;

import com.example.serverconsumer.serverconsumer.service.ConsumerCellProviderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
@RequestMapping("/consumer")
public class ConsumerCtr {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConsumerCellProviderSer consumerCellProviderSer;

    /**
     * 获取nacos配置中心 配置config.testLabel的值
     */
    @Value("${config.test.label:}")
    private String testLabel;

    @GetMapping("/templateCell")
    public String templateCell(){
        return restTemplate.getForObject("http://server-provider/provider/sayHello", String.class);
    }


    /**
     * 使用feign调用server-provider提供的接口
     * @return
     */
    @GetMapping("/feignCell")
    public String feignCell(){
        return consumerCellProviderSer.cellSayHello();
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
