package com.callmera.springkafka.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class MessageTemplate {
    private UUID id;
    private String title;
    private String description;
}
