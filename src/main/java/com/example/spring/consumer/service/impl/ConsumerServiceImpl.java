package com.example.spring.consumer.service.impl;

import com.example.spring.consumer.dto.MessageQueue;
import com.example.spring.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(MessageQueue messageQueue) {
// Simulação de erro!
//        if ("teste-erro".equalsIgnoreCase(messageQueue.getText())) {
//            throw new AmqpRejectAndDontRequeueException("Erro teste!");
//        }
        System.out.println("Mensagem Consumida: " + messageQueue.getText());
    }
}