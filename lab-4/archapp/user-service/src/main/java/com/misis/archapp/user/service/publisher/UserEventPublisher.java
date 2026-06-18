package com.misis.archapp.user.service.publisher;

import com.misis.archapp.contract.configuration.RabbitConfiguration;
import com.misis.archapp.contract.dto.UserCreatedEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserEventPublisher {

    private final RabbitTemplate rabbitTemplate;

    public UserEventPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publishUserCreatedEvent(UserCreatedEvent event) {

    }

    public void publish(UserCreatedEvent userCreatedEvent) {
    }

    public void publishUserEvent(UserCreatedEvent userCreatedEvent) {
    }
}