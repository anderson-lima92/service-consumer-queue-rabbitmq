package com.spring.rabbit.mq.consumer.service;

import com.spring.rabbit.mq.consumer.model.dto.Massege;

public interface ConsumerService {
	
	void action(Massege massege);

}
