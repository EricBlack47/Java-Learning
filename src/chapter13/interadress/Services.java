package chapter13.interadress;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Services {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(2333);
			System.out.println("Server start");
			Socket s = ss.accept();
			System.out.println("Server connected:" + s.getInetAddress() + "  port:" + s.getPort());
			new ChatRoom(s, "Client").start();;
			//BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream out = new PrintStream(s.getOutputStream());
			Scanner sc = new Scanner(System.in);
			//String say = br.readLine();
			while (true) {
				//System.out.println("client say:" + say);
				String send = sc.nextLine();
				out.println(send);
				//say = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("serving");
		}
	}
}
