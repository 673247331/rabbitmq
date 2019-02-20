package com.example.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    //监听队列
     @RabbitListener(queues="hello-agan-queue")
    public void process(String msg){
        System.out.println("receiver:"+msg);
    }
}
