package com.zmax.exchange;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zmax
 */
@Configuration
public class Config {

    public static final String queueName = "queueTest2";
    public static final String EXCHANGE_NAME = "directEXCHANGE";
    public static final String EXCHANGE_TYPE = "topic";
    public static final String ROUTING_KEY1 = "live.test";
    public static final String HOST = "localhost";
    public static final String LOGIN = "guest";
    public static final String PASS = "guest";

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(HOST);
        connectionFactory.setUsername(LOGIN);
        connectionFactory.setPassword(PASS);
        return connectionFactory;
    }

    @Bean
    Queue queue() {
        return new Queue(queueName, false, true, false, makeMassageTTL(18000));
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME, true, false);
    }

    /**
     * We've already created a fanout exchange and a queueName.
     * Now we need to tell the exchange to send messages to our queueName.
     * That relationship between exchange and a queueName is called a binding.
     *
     * @param queue
     * @param exchange
     * @return
     */
    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY1);
    }

    @Bean
    public AmqpAdmin amqpAdmin() {
        return new RabbitAdmin(connectionFactory());
    }

    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        template.setExchange(EXCHANGE_NAME);
        //The routing key is set to the name of the queueName by the broker for the default exchange
        return template;
    }


    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(queueName);
        container.setMessageListener(listenerAdapter);
        return container;
    }

    @Bean
    MessageListenerAdapter listenerAdapter() {
        return new MessageListenerAdapter() {
            @Override
            public void onMessage(Message message) {
                System.out.print("####### -> hello!" + message.toString());
            }

        };
    }

    public static Map<String, Object> makeMassageTTL(int millisec) {
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("x-message-ttl", millisec);
        return args;
    }

}
