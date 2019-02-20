package com.example.rabbitmq;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {
  //发送者
    @Autowired
    public AmqpTemplate rabbitTemplate;

    public void send(){
        String msg="hello"+new Date();
        this.rabbitTemplate.convertAndSend("hello-agan-queue",msg);
    }
}
