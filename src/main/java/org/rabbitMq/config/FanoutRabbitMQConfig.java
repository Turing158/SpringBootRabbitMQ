package org.rabbitMq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//FanoutRabbitMQConfig.java
@Configuration
public class FanoutRabbitMQConfig {
    @Bean
    public Queue queueRadio(){
        return new Queue("radio");
    }
    @Bean
    public Queue queueTV(){
        return new Queue("tv");
    }
    @Bean
    public Queue queuePhone(){
        return new Queue("phone");
    }
    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }
    @Bean
    public Binding bindingExchangeRadio(Queue queueRadio,FanoutExchange fanoutExchange){
        return  BindingBuilder.bind(queueRadio).to(fanoutExchange);
    }
    @Bean
    public Binding bindingExchangeTV(Queue queueTV,FanoutExchange fanoutExchange){
        return  BindingBuilder.bind(queueTV).to(fanoutExchange);
    }
    @Bean
    public Binding bindingExchangePhone(Queue queuePhone,FanoutExchange fanoutExchange){
        return  BindingBuilder.bind(queuePhone).to(fanoutExchange);
    }
}
