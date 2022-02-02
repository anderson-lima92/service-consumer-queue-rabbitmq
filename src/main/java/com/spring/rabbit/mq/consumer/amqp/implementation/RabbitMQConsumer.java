package com.spring.rabbit.mq.consumer.amqp.implementation;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.rabbit.mq.consumer.amqp.AmqpConsumer;
import com.spring.rabbit.mq.consumer.model.dto.Massege;
import com.spring.rabbit.mq.consumer.service.ConsumerService;


@Component
public class RabbitMQConsumer implements AmqpConsumer<Massege>{
	
	@Autowired
	private ConsumerService consumerService;

	@Override
	@RabbitListener(queues = "rk.producer.exemplo-spring")
	public void consumer(Massege massege) {
		consumerService.action(massege);
	}
}
