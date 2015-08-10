package com.zmax.paho;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * Created by zmax
 */
public class MqttSubscriber extends MqttService {

    public static final MqttSubscriber INST = new MqttSubscriber();

    private MqttClient CLIENT;

    private MqttSubscriber(){
        try {
            this.CLIENT = new MqttClient(Conf.SERVER_URL, Conf.CLIENT_ID);
            connect(this.CLIENT);
            this.CLIENT.setCallback(new SubscriptionCallback());
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public void subscribe(String userId) {
        try {
            this.CLIENT.subscribe(userId, Conf.QOS_LEVEL);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

}
