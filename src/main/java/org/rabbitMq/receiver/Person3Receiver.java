package org.rabbitMq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "one")
public class Person3Receiver {
    @RabbitHandler
    public void process(String msg){
        System.out.println("Person3接收到的信息:"+msg);
    }
}
