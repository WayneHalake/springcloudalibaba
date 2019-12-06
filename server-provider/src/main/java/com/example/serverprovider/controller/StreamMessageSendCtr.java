package com.example.serverprovider.controller;

import com.example.serverprovider.streamMessage.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息队列，信息发送
 */
@RestController
@RequestMapping("/messageSend")
public class StreamMessageSendCtr {

    @Autowired
    MessageSender messageSender;

    @GetMapping("/send")
    public void sendMessage(){
        messageSender.sendMessage();
    }

}
