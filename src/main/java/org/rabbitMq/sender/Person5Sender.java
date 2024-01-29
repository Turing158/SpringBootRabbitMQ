package org.rabbitMq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Person5Sender.java
@Component
public class Person5Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send1(){
        String context = "hello我是Person5,RoutingKey为topic.msg";
        this.rabbitTemplate.convertAndSend("exchange","topic.msg",context);
    }
    public void send2(){
        String context = "hello我是Person5,RoutingKey为topic.msgs";
        this.rabbitTemplate.convertAndSend("exchange","topic.msgs.random",context);
    }
    public void send3(){
        String context = "hello我是Person5,RoutingKey为topic.random";
        this.rabbitTemplate.convertAndSend("exchange","topic.random",context);
    }
    public void send4(){
        String context = "hello我是Person5,RoutingKey为topic";
        this.rabbitTemplate.convertAndSend("exchange","topic",context);
    }
}
