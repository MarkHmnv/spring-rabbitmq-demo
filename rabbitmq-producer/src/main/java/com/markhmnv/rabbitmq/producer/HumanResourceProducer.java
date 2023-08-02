package com.markhmnv.rabbitmq.producer;

import com.markhmnv.rabbitmq.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HumanResourceProducer {
    private final RabbitTemplate rabbitTemplate;

    // Fanout exchange example
    public void sendEmployee(Employee employee) {
        rabbitTemplate.convertAndSend("hr", "", employee);
    }
}
