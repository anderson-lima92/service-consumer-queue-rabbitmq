package com.spring.rabbit.mq.consumer.amqp.api.implementation;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.rabbit.mq.consumer.domain.model.dto.Messege;
import com.spring.rabbit.mq.consumer.domain.service.ConsumerService;

@Component
public class RabbitMQConsumer {
	
	@Autowired
	private ConsumerService consumerService;

	@RabbitListener(queues = "rk.producer.exemplo-spring")
	public void consumer(Messege massege) {
		consumerService.saveMessage(massege);
	}
}
