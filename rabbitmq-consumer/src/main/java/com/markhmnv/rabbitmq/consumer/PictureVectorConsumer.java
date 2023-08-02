package com.markhmnv.rabbitmq.consumer;

import com.markhmnv.rabbitmq.model.Picture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PictureVectorConsumer {
    @RabbitListener(queues = "picture.vector")
    public void listen(Picture picture, Message message) {
        var receivedRoutingKey = message.getMessageProperties().getReceivedRoutingKey();
        log.info("Consume vector picture: {}, Routing Key: {}", picture, receivedRoutingKey);
    }
}
