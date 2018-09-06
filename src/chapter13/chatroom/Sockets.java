package chapter13.chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
 
//������Ϣ�߳�
class SendClientThreat implements Runnable {
	Socket socket;
	PrintWriter pWriter;
	Scanner scanner;
 
	public SendClientThreat(Socket socket) {
		super();
		this.socket = socket;
		this.scanner = new Scanner(System.in);
		try {
			pWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	@Override
	public void run() {
 
		while (true) {
			String strMsg =socket.getInetAddress().getHostAddress()+":"+ scanner.nextLine();
			pWriter.println(strMsg);
			pWriter.flush();
			
//			System.out.println(strMsg);
		}
 
	}
}
 
//������Ϣ�߳�
class ReceiveClientThreat implements Runnable {
	Socket socket;
	BufferedReader bReader;
 
	public ReceiveClientThreat(Socket socket) {
		super();
		this.socket = socket;
		try {
			bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	@Override
	public void run() {
		try {
 
			while (true) {
				String strMsg = bReader.readLine();
				System.out.println(strMsg);
			}
 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
}
 

public class Sockets {
	private static Socket socket;
	 
	public static void main(String[] args) {
		//����˵�IP
		String IPAdress="192.168.1.100";
		//����һ���ͻ���socket��ָ������˵�IP�Ͷ˿ں�
		try {
			socket = new Socket(IPAdress, 2333);
			System.out.println("���������ɹ��� ");
			
			new Thread(new ReceiveClientThreat(socket)).start(); 
			new Thread(new SendClientThreat(socket)).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
 

}
