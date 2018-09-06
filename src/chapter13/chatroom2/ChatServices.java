package chapter13.chatroom2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServices {

	private Set<Socket> sockets;
	private String sendmsg;

	public ChatServices() {
		try {
			ServerSocket serverSocket = new ServerSocket(2233);
			sockets=new HashSet<>();
			System.out.println("waiting...");	
			while(true) {
				Socket socket=serverSocket.accept();
				sockets.add(socket);
				sendmsg(socket.getInetAddress().getHostAddress()+"joined!");
				new Thread(new Runnable() {
					
					@Override
					public void run() {
					try {
						BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
						while(true) {
							String receive=br.readLine();
							sendmsg(socket.getInetAddress().getHostAddress()+"says"+receive);
						}
					} catch (IOException e) {
						sockets.remove(socket);
						System.out.println(socket.getInetAddress().getHostAddress()+"leave");
						e.printStackTrace();
					}
					}
				}).start();	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}
	public ChatServices(Set<Socket> sockets,String sendmsg) {
		this.sendmsg=sendmsg;
		this.sockets=sockets;	
	}
	
	private void sendmsg(String string) {
		for (Socket socket : sockets) {
			try {
				PrintWriter out=new PrintWriter(socket.getOutputStream());
				out.println(string);
				out.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}		
	
	public static void main(String[] args) {
		new ChatServices();
	}
}
