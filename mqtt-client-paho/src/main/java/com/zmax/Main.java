package com.zmax;

import com.zmax.dto.ChatMessage;
import com.zmax.paho.Config;
import com.zmax.paho.SubscriptionCallback;
import org.eclipse.paho.client.mqttv3.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zmax.
 */
public class Main implements MqttCallback {

    public static MqttClient CLIENT;

    public static void main(String[] args) throws MqttException, IOException, InterruptedException {

        if (args.length == 0) {
            System.out.println("Please set client user name");
            System.exit(0);
        }

        System.out.println("You connected as " + args[0]);

        init(args[0]);
        connect();
        //TODO: change to the new thread

        subscribe(args[0]);
        addListener();

        while (!typeAndSend(args[0]))
            System.out.println("finished.");
    }



    private static boolean typeAndSend(String publisherUser) throws IOException {
        ChatMessage chatM = new ChatMessage();
        chatM.setPublisherId(publisherUser);

        System.out.println("Type destination user logon:");
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        chatM.setConsumerId(bufferRead.readLine());

        System.out.println("Type message:");
        chatM.setMessage(bufferRead.readLine());

        //TODO publish to the destination user
        try {

            CLIENT.publish(chatM.getConsumerId(), chatM.getMessage().getBytes(), Config.QOS_LEVEL, true);
        } catch (MqttException e) {
            System.out.println("cannot sent message to the topic");
            e.printStackTrace();
        }

        System.out.println("sent");
        System.out.println("exit ? y/n");

        return bufferRead.readLine().equals("y");
    }


    private static void init(String clientId) {
        try {
            CLIENT = new MqttClient(Config.SERVER_URL, clientId);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public static void connect() {
        if (!CLIENT.isConnected()) {

            //TODO: send connection data to the rabbitMQ from back end side.
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            connOpts.setUserName("test");
            connOpts.setPassword("test".toCharArray());
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

    private static void subscribe(String userId) {
        //TODO subscribe by unique user login

        //mqtt-subscription-Pitqos1
        try {
            //CLIENT.subscribe(Config.MQTT_COMMON + userId + "qos" + Config.QOS_LEVEL, Config.QOS_LEVEL);
            CLIENT.subscribe(userId, Config.QOS_LEVEL);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    private static void addListener() {

        SubscriptionCallback callback = new SubscriptionCallback() {
            @Override
            protected void postMessageArrived() throws MqttException {
                System.out.println("Message arrived");

            }
        };
        CLIENT.setCallback(callback);
    }

    @Override
    public void connectionLost(Throwable throwable) {
        System.out.println("connectionLost");

    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
        System.out.println("messageArrived" + mqttMessage.toString());

    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        System.out.println("deliveryComplete");
    }
}
