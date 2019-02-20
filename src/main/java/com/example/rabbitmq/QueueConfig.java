package com.example.rabbitmq;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class QueueConfig {
 //建立一个队列
    @Bean
    public Queue queue(){
        return  new Queue("hello-agan-queue");
    }
}
