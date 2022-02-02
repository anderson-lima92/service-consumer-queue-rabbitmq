package com.spring.rabbit.mq.consumer.service.implementation;

import org.springframework.stereotype.Service;

import com.spring.rabbit.mq.consumer.model.dto.Massege;
import com.spring.rabbit.mq.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImplementation implements ConsumerService {

	@Override
	public void action(Massege massege) {
		System.out.println(massege.getText());  //provavelmente devemos definir aqui o codigo de gravação na tabela
	}

}
