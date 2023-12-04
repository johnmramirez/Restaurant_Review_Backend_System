package com.practice.project2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class MessageListener {

    public CountDownLatch latch = new CountDownLatch(3);

    @KafkaListener(topics = "${message.receive.topic.name}", groupId = "${message.group.name}", containerFactory = "kafkaListenerContainerFactory")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group 'foo': " + message);
        latch.countDown();
    }

}
