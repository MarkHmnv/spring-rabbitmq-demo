package com.markhmnv.rabbitmq.consumer;

import com.markhmnv.rabbitmq.model.Furniture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PromotionFreeDeliveryConsumer {
    @RabbitListener(queues = "promotion.free-delivery")
    public void listen(Furniture furniture) {
        log.info("Consume furniture with free delivery: {}", furniture);
    }
}
