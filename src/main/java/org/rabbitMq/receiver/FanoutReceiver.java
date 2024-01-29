package org.rabbitMq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
//FanoutReceiver.java
@Component
public class FanoutReceiver {
    @RabbitListener(queues = "radio")
    @RabbitHandler
    public void radio(String msg){
        System.out.println("监听radio："+msg);
    }
    @RabbitListener(queues = "phone")
    @RabbitHandler
    public void phone(String msg){
        System.out.println("监听phone："+msg);
    }
    @RabbitListener(queues = "tv")
    @RabbitHandler
    public void tv(String msg){
        System.out.println("监听tv："+msg);
    }
}
