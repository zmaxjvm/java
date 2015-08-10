package com.zmax.paho;

import org.eclipse.paho.client.mqttv3.*;

/**
 * Created by zmax
 */
public class SubscriptionCallback implements MqttCallback {

    @Override
    public void connectionLost(Throwable throwable) {
        System.out.println("Connection lost");
    }

    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
        String str = new String(mqttMessage.getPayload());
        System.out.println("" + str);
        MqttPublish.INST.publish(Conf.CLIENT_ID, (new String(mqttMessage.getPayload())+ "!"));
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        System.out.println("Delivery completed to the RabbitMQ");
    }

}