package com.callmera.springkafka.controller;

import com.callmera.springkafka.dto.MessageTemplate;
import com.callmera.springkafka.producer.KafkaJsonProducer;
import com.callmera.springkafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/message")
public class MessageController {

    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping
    public ResponseEntity<String> produce(@RequestBody String message) {
        kafkaProducer.produce(message);
        return ResponseEntity.ok("Message produced");
    }

    @PostMapping("/json")
    public ResponseEntity<String> produceJson(@RequestBody MessageTemplate message) {
        kafkaJsonProducer.produce(message);
        return ResponseEntity.ok("Message produced");
    }
}
