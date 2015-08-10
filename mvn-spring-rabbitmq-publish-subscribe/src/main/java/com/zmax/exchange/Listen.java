package com.zmax.exchange;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

import java.io.IOException;

/**
 * Created by zmax
 */
public class Listen {

    public static final void listen() throws IOException, InterruptedException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(Config.HOST);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(Config.EXCHANGE_NAME, Config.EXCHANGE_TYPE, true);
        String queueName = channel.queueDeclare().getQueue();
        channel.queueBind(queueName, Config.EXCHANGE_NAME, Config.ROUTING_KEY1);


        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        QueueingConsumer consumer = new QueueingConsumer(channel);
        channel.basicConsume(queueName, true, consumer);

        while (true) {
            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
            String message = new String(delivery.getBody());

            System.out.println(" [x] Received '" + message + "'");
        }

    }
}
