package com.ruoyi.rabbitmq.mq.consumer;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Slf4j
public class SpringRabbitListener {

    @SneakyThrows
    @RabbitListener(queues = "work.queue")
    public void listenWorkQueue1(String msg){
        // 输出接收到消息的时间，以便跟踪消息处理的时间点
        log.info("消费者1接收到消息:{},时间为:{}",msg,LocalTime.now());
        // 模拟消息处理时间，让线程睡眠20毫秒
        Thread.sleep(20);
    }

    @SneakyThrows
    @RabbitListener(queues = "work.queue")
    public void listenWorkQueue2(String msg){
        // 输出接收到消息的时间，以便跟踪消息处理的时间点
        log.error("消费者2接收到消息:{},时间为:{}",msg,LocalTime.now());
        // 模拟消息处理时间，让线程睡眠20毫秒
        Thread.sleep(20);
    }

    @RabbitListener(queues = "fanout.queue1")
    public void listenFanoutQueue1(String msg) {
        System.out.println("消费者1接收到Fanout消息：【" + msg + "】");
    }

    @RabbitListener(queues = "fanout.queue2")
    public void listenFanoutQueue2(String msg) {
        System.out.println("消费者2接收到Fanout消息：【" + msg + "】");
    }

    @RabbitListener(queues = "direct.queue1")
    public void listenDirectQueue1(String msg) {
        System.out.println("消费者1接收到direct.queue1的消息：【" + msg + "】");
    }

    @RabbitListener(queues = "direct.queue2")
    public void listenDirectQueue2(String msg) {
        System.out.println("消费者2接收到direct.queue2的消息：【" + msg + "】");
    }


}
