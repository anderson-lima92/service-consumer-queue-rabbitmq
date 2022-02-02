package com.spring.rabbit.mq.consumer.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rabbit.mq.consumer.domain.model.dto.Messege;
import com.spring.rabbit.mq.consumer.domain.service.repository.MessageRepository;

@Service
public class ConsumerService {

	@Autowired
	MessageRepository messageRepository;

	public Messege saveMessage(Messege messege) {
		System.out.println(messege.getText());
		return messageRepository.save(messege);
	}
}
