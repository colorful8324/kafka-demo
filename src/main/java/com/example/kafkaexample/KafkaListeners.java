package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "topic1",
            groupId = "foo"
    )
    void listen(String message) {
        System.out.println("Received message in group foo: " + message);
    }
}
