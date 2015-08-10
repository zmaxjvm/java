package com.zmax.queue;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zmax
 */
@Configuration
public class HelloWorldConfiguration {

	protected final String helloWorldQueueName = "hello.world.queueName";

	@Bean
	public ConnectionFactory connectionFactory() {
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
		connectionFactory.setUsername("guest");
		connectionFactory.setPassword("guest");
		return connectionFactory;
	}
	
	@Bean
	public AmqpAdmin amqpAdmin() {
		return new RabbitAdmin(connectionFactory());
	}

	@Bean
	public RabbitTemplate rabbitTemplate() {
		RabbitTemplate template = new RabbitTemplate(connectionFactory());
		//The routing key is set to the name of the queueName by the broker for the default exchange.
		template.setRoutingKey(this.helloWorldQueueName);
		//Where we will synchronously receive messages from
		template.setQueue(this.helloWorldQueueName);
		return template;
	}

	@Bean
	// Every queueName is bound to the default direct exchange
	public Queue helloWorldQueue() {
		return new Queue(this.helloWorldQueueName);
	}

	/*
	@Bean 
	public Binding binding() {
		return declare(new Binding(helloWorldQueue(), defaultDirectExchange()));
	}*/
	
	/*	
	@Bean
	public TopicExchange helloExchange() {
		return declare(new TopicExchange("hello.world.exchange"));
	}*/
	
	/*
	public Queue declareUniqueQueue(String namePrefix) {
		Queue queueName = new Queue(namePrefix + "-" + UUID.randomUUID());
		rabbitAdminTemplate().declareQueue(queueName);
		return queueName;
	}
	
	// if the default exchange isn't configured to your liking....
	@Bean Binding declareP2PBinding(Queue queueName, DirectExchange exchange) {
		return declare(new Binding(queueName, exchange, queueName.getName()));
	}
	
	@Bean Binding declarePubSubBinding(String queuePrefix, FanoutExchange exchange) {
		return declare(new Binding(declareUniqueQueue(queuePrefix), exchange));
	}
	
	@Bean Binding declarePubSubBinding(UniqueQueue uniqueQueue, TopicExchange exchange) {
		return declare(new Binding(uniqueQueue, exchange));
	}
	
	@Bean Binding declarePubSubBinding(String queuePrefix, TopicExchange exchange, String routingKey) {
		return declare(new Binding(declareUniqueQueue(queuePrefix), exchange, routingKey));
	}*/

}
