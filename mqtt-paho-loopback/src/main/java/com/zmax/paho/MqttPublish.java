package com.zmax.paho;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * Created by zmax
 */
public class MqttPublish extends MqttService {

    public static final MqttPublish INST = new MqttPublish();

    private MqttClient CLIENT;

    private MqttPublish() {
        try {
            this.CLIENT = new MqttClient(Conf.SERVER_URL, Conf.CLIENT_ID + "publisher");
            connect(this.CLIENT);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public void publish(String destination, String msg) {
        try {
            this.CLIENT.publish(destination, msg.getBytes(), Conf.QOS_LEVEL, true);
        } catch (MqttException e) {
            System.out.println("cannot sent message to the topic");
            e.printStackTrace();
        }
    }
}
