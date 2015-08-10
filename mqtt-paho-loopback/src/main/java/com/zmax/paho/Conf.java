package com.zmax.paho;

/**
 * Created by zmax
 */
public interface Conf {
    String HOST = "127.0.0.1";
    int PORT = 1883;
    String SERVER_URL = "tcp://" + HOST + ":" + PORT;
    String CLIENT_ID = "ClientId";

    //QoS -"Quality of service" http://www.eclipse.org/paho/files/mqttdoc/Cclient/qos.html
    int QOS_LEVEL = 1;
}
