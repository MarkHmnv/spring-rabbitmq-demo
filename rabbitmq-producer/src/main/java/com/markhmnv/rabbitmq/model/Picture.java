package com.markhmnv.rabbitmq.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Picture {
    private String name;
    private String type;
    private String source;
    private long size;
}
