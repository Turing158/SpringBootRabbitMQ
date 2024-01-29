package org.rabbitMq.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//TopicRabbitMQConfig.java
@Configuration
public class TopicRabbitMQConfig {
    @Bean
    public Queue queueMsg(){
        return new Queue("msg");
    }
    @Bean
    public Queue queueMsgs(){
        return new Queue("msgs");
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("exchange");
    }
    @Bean
    public Binding BindingExchangeMsg(Queue queueMsg,TopicExchange exchange){
        return BindingBuilder.bind(queueMsg).to(exchange).with("topic.msg");
    }
    @Bean
    public Binding BindingExchangeMsgs(Queue queueMsgs,TopicExchange exchange){
        return BindingBuilder.bind(queueMsgs).to(exchange).with("topic.#");
    }

}
