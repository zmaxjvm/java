package com.zmax.paho;

/**
 * Created by zmax.
 */
public interface Config {

    String host = "127.0.0.1";
    int port = 1883;
    String SERVER_URL = "tcp://" + host + ":" + port;

    //String SERVER_URL = "tcp://m2m.eclipse.org:1883";
    //String SERVER_URL = "tcp://127.0.0.1:1883";

    String PUBLISH = "chat_publish";
    String SUBSCRIBE = "topic_subscribe_";
    String SYSTEM_TOPIC = "sys.topic";
    //QoS -"Quality of service" http://www.eclipse.org/paho/files/mqttdoc/Cclient/qos.html
    int QOS_LEVEL = 1;
}
