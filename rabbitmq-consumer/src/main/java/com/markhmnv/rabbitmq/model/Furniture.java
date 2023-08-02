package com.markhmnv.rabbitmq.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Furniture {
    private String name;
    private String color;
    private String material;
    private int price;
}
