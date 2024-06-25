package com.callmera.springkafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "spring")
    public void consume(String message) {
        log.info(format("Consuming message:: %s", message));
    }
}
