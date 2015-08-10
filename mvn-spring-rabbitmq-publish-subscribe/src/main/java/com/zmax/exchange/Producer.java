package com.zmax.exchange;

import org.springframework.amqp.core.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmax
 */
public class Producer {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
        for (int i = 0; i < 10; i++) {
            amqpTemplate.convertAndSend(Config.EXCHANGE_NAME, Config.ROUTING_KEY1, "hello from exchange, my routing key = " + Config.ROUTING_KEY1);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done");
    }

}
