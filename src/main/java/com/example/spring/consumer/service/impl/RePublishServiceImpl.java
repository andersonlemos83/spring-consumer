package com.example.spring.consumer.service.impl;

import com.example.spring.consumer.amqp.AmqpRePublish;
import com.example.spring.consumer.service.RePublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RePublishServiceImpl implements RePublishService {

    @Autowired
    private AmqpRePublish amqpRePublish;

    @Override
    public void repost() {
        amqpRePublish.rePublish();
    }
}