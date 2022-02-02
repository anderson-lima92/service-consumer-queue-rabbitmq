CREATE TABLE rabbitmq.message (
	id SERIAL CONSTRAINT pk_message_id PRIMARY KEY,
 	text varchar(255) not null
);