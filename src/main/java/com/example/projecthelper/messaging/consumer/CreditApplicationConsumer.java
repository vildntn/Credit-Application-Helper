package com.example.projecthelper.messaging.consumer;

import com.example.projecthelper.config.RabbitMQConfig;
import com.example.projecthelper.model.entity.CreditApplication;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class CreditApplicationConsumer {
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(CreditApplication creditApplication) {
       System.out.println("Dear "+creditApplication.getCustomer().getFirstName()+" "+creditApplication.getCustomer().getLastName()
               +"\nYour Credit Application Result: "+ creditApplication.getCreditStatus()+
               "\nYour Credit Limit: "+ creditApplication.getCreditLimit());

    }
}
