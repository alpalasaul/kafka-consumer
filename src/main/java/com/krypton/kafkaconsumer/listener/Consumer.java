package com.krypton.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

}
