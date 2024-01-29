package org.rabbitMq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//FanoutSender.java
@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send1(){
        String context = "我是FanoutSender,发送了send1,路由键为'abcdefg'";
        this.rabbitTemplate.convertAndSend("fanoutExchange","abcdefg", context);
    }
    public void send2(){
        String context = "我是FanoutSender,发送了send2,路由键为' '";
        this.rabbitTemplate.convertAndSend("fanoutExchange","", context);
    }
    public void send3(){
        String context = "我是FanoutSender,发送了send3,路由键为'fanout'";
        this.rabbitTemplate.convertAndSend("fanoutExchange","fanout", context);
    }
}
