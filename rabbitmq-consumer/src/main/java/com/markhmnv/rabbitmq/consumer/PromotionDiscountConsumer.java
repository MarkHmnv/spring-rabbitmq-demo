package com.markhmnv.rabbitmq.consumer;

import com.markhmnv.rabbitmq.model.Furniture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PromotionDiscountConsumer {
    @RabbitListener(queues = "promotion.discount")
    public void listen(Furniture furniture) {
        log.info("Consume furniture with discount: {}", furniture);
    }
}
