package org.rabbitMq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
//Receivers.java
@Component
public class Receivers {
    @RabbitListener(queues = "msg")
    @RabbitHandler
    public void person6(String msg){
        System.out.println("Person6接收到的信息:"+msg);
    }
    @RabbitListener(queues = "msgs")
    @RabbitHandler
    public void person7(String msg){
        System.out.println("Person7接收到的信息:"+msg);
    }
}
