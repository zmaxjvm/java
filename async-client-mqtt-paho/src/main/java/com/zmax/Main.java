package com.zmax;

import com.google.gson.Gson;
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
public class Main {

    public static MqttAsyncClient CLIENT;

    public static final Gson GSON = new Gson();

    public static void main(String[] args) throws MqttException, IOException, InterruptedException {

        if (args.length == 0) {
            System.out.println("Please set client user name");
            System.exit(0);
        }
        System.out.println("You connected as " + args[0]);

        init(args[0]);
        connect();
        //TODO: change to the new thread
        Thread.sleep(4000);
        subscribe(Config.SUBSCRIBE + args[0]);
        addListener();

        while (!typeAndSend(args[0]))
            System.out.println("finished.");
    }

    private static boolean typeAndSend(String publisherUser) throws IOException {
        ChatMessage chatM = new ChatMessage();
        chatM.setPublisherUserId(publisherUser);

        System.out.println("Type destination user logon:");
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        chatM.setConsumerUserId(bufferRead.readLine());

        System.out.println("Type message:");
        chatM.setMessage(bufferRead.readLine());

        try {
            CLIENT.publish(Config.PUBLISH, GSON.toJson(chatM).getBytes(), Config.QOS_LEVEL, true);
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
            CLIENT = new MqttAsyncClient(Config.SERVER_URL, clientId);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public static void connect() {
        if (!CLIENT.isConnected()) {

            //TODO: send connection data to the rabbitMQ from back end side.
            MqttConnectOptions connOpts = new MqttConnectOptions();
            //connOpts.setCleanSession(true);
            connOpts.setUserName("test");
            connOpts.setPassword("test".toCharArray());
            connOpts.setConnectionTimeout(30);
            connOpts.setKeepAliveInterval(60);
            connOpts.setMqttVersion(MqttConnectOptions.MQTT_VERSION_3_1_1);
            connOpts.getMqttVersion();

            try {
                CLIENT.connect(connOpts, new IMqttActionListener() {
                    @Override
                    public void onSuccess(IMqttToken iMqttToken) {
                        System.out.println("Yeah, " + CLIENT.getClientId() + " connected");
                    }

                    @Override
                    public void onFailure(IMqttToken iMqttToken, Throwable throwable) {
                        System.out.println("Sigh, not connected");
                    }
                });
            } catch (MqttException e) {
                e.printStackTrace();
            }
        }
    }

    private static void subscribe(String userId) {
        try {
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
}
