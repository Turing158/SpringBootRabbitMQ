package org.rabbitMq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person1Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(int i){
//        String context = "hello我是Person1";
        String context = "hello我是Person1-----------------"+i;
        this.rabbitTemplate.convertAndSend("one",context);
    }
}
