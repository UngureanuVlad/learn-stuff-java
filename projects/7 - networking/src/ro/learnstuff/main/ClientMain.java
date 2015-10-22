package ro.learnstuff.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) {
		Socket socket = null;
		PrintWriter out = null;
		try {
			socket = new Socket("127.0.0.1", 8080);
			out = new PrintWriter(socket.getOutputStream(), true);
			out.println("Vlad Ungureanu");
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
