package io.learnstuff.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public ServerSocket serverSocket = null;
    public SimpleWorkerThread simpleWorkerThread = null;

    public void start() throws IOException {
        try {
            System.out.println("Server started!");
            serverSocket = new ServerSocket(8080);

            Socket socket = serverSocket.accept();
            simpleWorkerThread = new SimpleWorkerThread(socket);
            simpleWorkerThread.start();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("You should log this error!");
        }
    }

}
