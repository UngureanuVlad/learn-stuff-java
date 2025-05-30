package io.learnstuff.main;

import io.learnstuff.tcp.SimpleServer;

import java.io.IOException;

public class ServerMain {

    public static void main(String[] args) {
        SimpleServer simpleServer = null;
        try {
            simpleServer = new SimpleServer();
            simpleServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
