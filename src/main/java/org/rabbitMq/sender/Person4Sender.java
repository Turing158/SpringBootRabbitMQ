package org.rabbitMq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Person4Sender.java
@Component
public class Person4Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(int i){
        String context = "hello我是Person4---------------"+i;
        this.rabbitTemplate.convertAndSend("one",context);
    }
}
