package com.ruoyi.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

//@Configuration
public class RabbitMQQueueConfig {

    // 声明队列
    @Bean
    public Queue myQueue() {
        return new Queue("simple.queue");
    }
}
