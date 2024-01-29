package org.rabbitMq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "one")
public class Person2Receiver {
    @RabbitHandler
    public void process(String msg){
        System.out.println("Person2接收到的信息:"+msg);
    }
}
