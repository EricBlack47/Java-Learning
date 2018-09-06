package chapter13.interadress;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
	public static void main(String[] args) {

		try {
			Socket s = new Socket("192.168.1.104", 3000);
			System.out.println("conneted to host");
			new ChatRoom(s, "Server").start();;
			PrintStream out = new PrintStream(s.getOutputStream());
			// System.out.println("Please write your message:");
			Scanner sc = new Scanner(System.in);
			//BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String send;
			send = sc.nextLine();
			while (true) {
				out.println(send);
				out.flush();
				//String receive = br.readLine();
				//System.out.println("Server say:" + receive);
				send = sc.nextLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
