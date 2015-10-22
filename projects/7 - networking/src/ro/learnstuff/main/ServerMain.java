package ro.learnstuff.main;

import java.io.IOException;

import ro.learnstuff.tcp.SimpleServer;

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
