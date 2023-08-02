package com.markhmnv.rabbitmq.consumer;

import com.markhmnv.rabbitmq.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AccountingConsumer {

    @RabbitListener(queues = "hr.accounting")
    public void listen(Employee employee) {
        log.info("Consume employee from accounting: {}", employee);
    }
}
