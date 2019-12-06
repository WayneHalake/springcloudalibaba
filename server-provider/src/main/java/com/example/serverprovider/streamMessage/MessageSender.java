package com.example.serverprovider.streamMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * EnableBinding 在应用启动的时候实现对定义的消息通道的绑定
 */
@EnableBinding(value = {OutputInterface.class})
@Component
public class MessageSender {

    @Autowired
    OutputInterface outputInterface;

    /**
     * 发送消息
     */
    public void sendMessage(){
        // header=<'partitionKey', 1>
        Message message = MessageBuilder.withPayload("From server-provider").setHeader("partitionKey", 1).build();
        outputInterface.output().send(message);
    }

}
