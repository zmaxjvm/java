package com.zmax.paho;


import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 * Created by zmax.
 */
public class NonBlockingPublisher {

    //TODO: message persistence service
    private static MqttClientPersistence persistence = new MemoryPersistence();

    public static void main(String[] args) throws MqttException {

        MqttClient client = new MqttClient(Config.SERVER_URL, "Config.CLIENT_ID", null); // null for no client-side persistence
        client.connect();

        MqttTopic topic = client.getTopic("Settings.TOPIC_NAME");
        MqttMessage message = new MqttMessage();
        message.setPayload("Hello from the Paho non-blocking client 3".getBytes());
        message.setRetained(true);
        topic.publish(message);
        System.out.println("Publishing succeeded");

        client.disconnect();
        client.close();
    }

}
