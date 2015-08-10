package com.zmax.paho;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * Created by zmax
 */
public class MqttService  {

    public void connect(MqttClient CLIENT) {
        if (!CLIENT.isConnected()) {
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            //TODO move to the property
            connOpts.setUserName("link");
            connOpts.setPassword("link".toCharArray());
            connOpts.setConnectionTimeout(30);
            connOpts.setKeepAliveInterval(60);
            connOpts.setMqttVersion(MqttConnectOptions.MQTT_VERSION_3_1_1);
            connOpts.getMqttVersion();

            try {
                CLIENT.connect(connOpts);
            } catch (MqttException e) {
                e.printStackTrace();
            }
        }
    }
}
