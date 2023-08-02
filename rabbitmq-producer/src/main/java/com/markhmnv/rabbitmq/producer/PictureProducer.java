package com.markhmnv.rabbitmq.producer;

import com.markhmnv.rabbitmq.model.Picture;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PictureProducer {
    private final RabbitTemplate rabbitTemplate;
    private static final int LARGE_SIZE_THRESHOLD = 4000;

    // Direct exchange example
    public void sendPicture(Picture picture) {
        rabbitTemplate.convertAndSend("picture", picture.getType(), picture);
    }

    // Topic exchange example
    public void sendPictureWithTopic(Picture picture) {
        var topic = new StringBuilder();

        // 1st word is picture source
        topic.append(picture.getSource());
        topic.append(".");

        // 2nd word is small or large size
        var size = picture.getSize() > LARGE_SIZE_THRESHOLD ? "large" : "small";
        topic.append(size);
        topic.append(".");

        // 3rd word is picture type
        topic.append(picture.getType());

        rabbitTemplate.convertAndSend("picture.topic", topic.toString(), picture);
    }
}
