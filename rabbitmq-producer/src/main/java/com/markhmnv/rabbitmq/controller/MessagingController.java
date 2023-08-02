package com.markhmnv.rabbitmq.controller;

import com.markhmnv.rabbitmq.model.Employee;
import com.markhmnv.rabbitmq.model.Furniture;
import com.markhmnv.rabbitmq.model.Picture;
import com.markhmnv.rabbitmq.producer.FurnitureProducer;
import com.markhmnv.rabbitmq.producer.HumanResourceProducer;
import com.markhmnv.rabbitmq.producer.PictureProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/rmq")
public class MessagingController {
    private final HumanResourceProducer hrProducer;
    private final PictureProducer pictureProducer;
    private final FurnitureProducer furnitureProducer;

    @PostMapping("/employees")
    public void sendEmployee(@RequestBody Employee employee) {
        hrProducer.sendEmployee(employee);
    }

    @PostMapping("/pictures/direct")
    public void sendPicture(@RequestBody Picture picture) {
        pictureProducer.sendPicture(picture);
    }

    @PostMapping("/pictures/topic")
    public void sendPictureWithTopic(@RequestBody Picture picture) {
        pictureProducer.sendPictureWithTopic(picture);
    }

    @PostMapping("/furniture")
    public void sendFurniture(@RequestBody Furniture furniture) {
        furnitureProducer.sendFurniture(furniture);
    }
}
