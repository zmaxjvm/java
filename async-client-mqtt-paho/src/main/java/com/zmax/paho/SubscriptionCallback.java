package com.zmax.paho;

import com.zmax.Main;
import com.zmax.dto.ChatMessage;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Created by zmax.
 */
public abstract class SubscriptionCallback implements MqttCallback {

    @Override
    public void connectionLost(Throwable throwable) {
        System.out.println("Connection lost");
        Main.connect();
        System.out.println("Reconnected");
    }

    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
        String str = new String(mqttMessage.getPayload());
        ChatMessage chatMessage = Main.GSON.fromJson(str, ChatMessage.class);
        System.out.println("Message arrived from:"+chatMessage.getPublisherUserId());
        System.out.println("Message body:"+chatMessage.getMessage());
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        System.out.println("Oh, delivery complete");
    }

    protected abstract void postMessageArrived() throws MqttException;
}