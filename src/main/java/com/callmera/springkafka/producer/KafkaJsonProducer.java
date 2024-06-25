package com.callmera.springkafka.producer;

import com.callmera.springkafka.dto.MessageTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import static java.lang.String.format;
import static org.springframework.kafka.support.KafkaHeaders.TOPIC;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaJsonProducer {

    private final KafkaTemplate<String, MessageTemplate> kafkaTemplate;

    public void produce(MessageTemplate message) {
        Message<MessageTemplate> messageTemplate = MessageBuilder.withPayload(message).setHeader(TOPIC, "my-topic").build();
        log.info(format("Sending Json Message:: %s", message.getTitle()));
        kafkaTemplate.send(messageTemplate);
    }
}
