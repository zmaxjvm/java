package com.zmax.paho;

/**
 * Created by zmax.
 */
public interface Config {
    String host = "m2m.eclipse.org";
    int port = 1883;
    String SERVER_URL = "tcp://" + host + ":" + port;

    //String SERVER_URL = "tcp://m2m.eclipse.org:1883";
    String MQTT_COMMON = "mqtt-subscription-";
    String MQTT_SYSTEM = "mqtt-subscription-"+"back-end"+"qos"+Config.QOS_LEVEL;

    //QoS -"Quality of service" http://www.eclipse.org/paho/files/mqttdoc/Cclient/qos.html
    int QOS_LEVEL = 1;
}
