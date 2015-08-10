package com.zmax;

import com.zmax.paho.Conf;
import com.zmax.paho.MqttSubscriber;
import com.zmax.paho.MqttPublish;
import org.eclipse.paho.client.mqttv3.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zmax
 */
public class Main {

    public static void main(String[] args) throws MqttException, IOException, InterruptedException {
        MqttSubscriber.INST.subscribe(Conf.CLIENT_ID);
        MqttPublish.INST.publish(Conf.CLIENT_ID, "please use Scala!");
    }

    private static boolean typeAndSend() throws IOException {
        System.out.println("Type destination user logon:");
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String dest = bufferRead.readLine();

        System.out.println("Type message:");
        String msg = bufferRead.readLine();

        MqttPublish.INST.publish(dest, msg);
        System.out.println("sent");
        System.out.println("exit ? y/n");

        return bufferRead.readLine().equals("y");
    }

}



