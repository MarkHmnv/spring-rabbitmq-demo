package com.markhmnv.rabbitmq.producer;

import com.markhmnv.rabbitmq.model.Furniture;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FurnitureProducer {
    private final RabbitTemplate rabbitTemplate;

    // Headers exchange example
    public void sendFurniture(Furniture furniture) {
        rabbitTemplate.convertAndSend("promotion", "", furniture, m -> {
            var messageProperties = m.getMessageProperties();
            messageProperties.setHeader("color", furniture.getColor());
            messageProperties.setHeader("material", furniture.getMaterial());
            return m;
        });
    }
}
