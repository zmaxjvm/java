package com.zmax.exchange;

import org.springframework.amqp.rabbit.core.ChannelCallback;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.io.IOException;

import com.rabbitmq.client.Channel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zmax
 */
public class Consumer1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        RabbitTemplate rabbitTemplate = context.getBean(RabbitTemplate.class);
        declareTestQueue(rabbitTemplate,Config.ROUTING_KEY1, Config.queueName);
    }

    static void declareTestQueue(RabbitTemplate template, final String routingKey, final String queueName) {
        // declare and bind queueName
        template.execute(new ChannelCallback<String>() {
            public String doInRabbit(Channel channel) throws Exception {
                channel.queueBind(queueName, Config.EXCHANGE_NAME, routingKey);
                return queueName;
            }
        });
    }
}


