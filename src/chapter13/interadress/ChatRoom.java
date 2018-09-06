package chapter13.interadress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatRoom extends Thread {

	private Socket s;
	private String name;

	public ChatRoom(Socket s, String name) {
		this.name = name;
		this.s = s;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while (true) {
				String message = br.readLine();
				System.out.println(this.name + " say:" + message);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
