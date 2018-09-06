package chapter13.chatroom2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {
	
	public static void main(String[] args) {
		try {
			Socket socket= new Socket("192.168.1.100",2233);
			System.out.println("connected successfuly");
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
						while(true) {
							String receive=br.readLine();
							System.out.println(receive);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}	
				}
			}).start();;
			PrintWriter out=new PrintWriter(socket.getOutputStream());
			Scanner sc=new Scanner(System.in);
			while(true) {
				out.println(sc.nextLine());
				out.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
