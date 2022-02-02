package com.spring.rabbit.mq.consumer.amqp;

public interface AmqpConsumer<T>{

	void consumer(T t);

}
