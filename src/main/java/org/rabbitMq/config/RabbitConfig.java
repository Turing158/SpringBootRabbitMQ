package org.rabbitMq.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//队列配置
//RabbitConfig.java
@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue(){
        return new Queue("hello");
    }
    @Bean
    public Queue Queue1(){
        return new Queue("one");
    }
}
