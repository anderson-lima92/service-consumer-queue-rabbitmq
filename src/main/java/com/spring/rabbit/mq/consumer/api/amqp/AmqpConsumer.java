package com.spring.rabbit.mq.consumer.api.amqp;

public interface AmqpConsumer<T>{

	void consumer(T t);

}
