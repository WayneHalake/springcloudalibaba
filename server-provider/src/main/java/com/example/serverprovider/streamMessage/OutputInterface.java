package com.example.serverprovider.streamMessage;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface OutputInterface {

    /**
     * 绑定消息通道output
     * @Output 定义消息通道
     * @return
     */
    @Output("output")
    MessageChannel output();
}
