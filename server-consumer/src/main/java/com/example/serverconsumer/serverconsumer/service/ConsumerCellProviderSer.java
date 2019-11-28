package com.example.serverconsumer.serverconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * feign 客户端调用接口
 * @FeignClient 指明服务提供方
 * 对应的抽象方法，表示服务提供方提供的接口
 */
@FeignClient("server-provider")
@Component
public interface ConsumerCellProviderSer {

    /**
     * server-provider 微服务提供的/provider/sayHello接口
     * @return
     */
    @GetMapping("/provider/sayHello")
    String cellSayHello();
}
