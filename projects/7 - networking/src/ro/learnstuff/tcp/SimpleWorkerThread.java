package ro.learnstuff.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleWorkerThread extends Thread {
	private Socket socket = null;

	public SimpleWorkerThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String request = in.readLine();
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			String response = "Hello " + request + "!";
			out.println(response);
			System.out.println(response);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
