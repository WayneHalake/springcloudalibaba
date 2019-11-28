package com.example.serverconsumer.serverconsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConfig {

    @Bean
    @LoadBalanced  //客户端负载均衡
    public RestTemplate gertRestTemplate(){
        return new RestTemplate();
    }
}
