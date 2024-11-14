package com.ruoyi.rabbitmq.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;

//@Configuration
public class RabbitMQExchangeConfig {

    @Bean
    public DirectExchange directExchange() {
        return ExchangeBuilder.directExchange("direct.exchange").durable(true).build();
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return ExchangeBuilder.fanoutExchange("fanout.exchange").durable(true).build();
    }

    @Bean
    public TopicExchange topicExchange() {
        return ExchangeBuilder.topicExchange("topic.exchange").durable(true).build();
    }

}
