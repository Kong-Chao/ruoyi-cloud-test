package com.ruoyi.rabbitmq;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class RuoYiRabbitMqApplicationTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @SneakyThrows
    @Test
    public void testWorkQueue() {
        // 队列名称
        String queueName = "work.queue";
        // 消息
        String message = "Hello, World_";
        for (int i = 0; i < 100; i++) {
            // 发送消息，每20毫秒发送一次，相当于每秒发送50条消息
            rabbitTemplate.convertAndSend(queueName, message + i);
            Thread.sleep(20);
        }
    }

    @Test
    public void testFanoutExchange() {
        // 交换机名称
        String exchangeName = "demo.fanout";
        // 消息
        String message = "hello, everyone!";
        // 二个参数用来指定路由键。对于Fanout交换机，路由键没有实际意义，因此可以传递一个空字符串
        rabbitTemplate.convertAndSend(exchangeName, "", message);
    }

    @Test
    public void testSendDirectExchange1() {
        // 交换机名称
        String exchangeName = "demo.direct";
        // 消息
        String message = "红色警报！日本乱排核废水，导致海洋生物变异，惊现哥斯拉！";
        // 发送消息
        rabbitTemplate.convertAndSend(exchangeName, "red", message);
    }

    @Test
    public void testSendDirectExchange2() {
        // 交换机名称
        String exchangeName = "demo.direct";
        // 消息
        String message = "最新报道，哥斯拉是居民自治巨型气球，虚惊一场！";
        // 发送消息
        rabbitTemplate.convertAndSend(exchangeName, "blue", message);
    }


    @Test
    public void testSendTopicExchange1() {
        // 交换机名称
        String exchangeName = "demo.topic";
        // 消息
        String message = "喜报！孙悟空大战哥斯拉，胜!";
        // 发送消息
        rabbitTemplate.convertAndSend(exchangeName, "china.news", message);
    }

    @Test
    public void testSendTopicExchange2() {
        // 交换机名称
        String exchangeName = "demo.topic";
        // 消息
        String message = "喜报！孙悟空大战哥斯拉，胜!";
        // 发送消息
        rabbitTemplate.convertAndSend(exchangeName, "china.weather", message);
    }

    @Test
    public void testSendTopicExchange3() {
        // 交换机名称
        String exchangeName = "demo.topic";
        // 消息
        String message = "日本新闻";
        // 发送消息
        rabbitTemplate.convertAndSend(exchangeName, "japan.news", message);
    }

    @Test
    public void testSendTopicExchange4() {
        // 交换机名称
        String exchangeName = "demo.topic";
        // 消息
        String message = "日本的天气消息";
        // 发送消息
        rabbitTemplate.convertAndSend(exchangeName, "japan.weather", message);
    }

}