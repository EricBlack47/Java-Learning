package chapter13.chatroom;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerRoom {
		public static ArrayList<Socket> socketList=new ArrayList<>();
		
		public static void main(String[] args) {
			ServerSocket serverSocket = null;
			 
			try {
				//�½�һ�������ServerSocket�������˿ں�Ϊ30000���˿ںŽ���������һ���
				serverSocket = new ServerSocket(30000);
				System.out.println("�ȴ��ͻ�������...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (true) {
				Socket socket = null;
				while (true) {
					try {
						//�����ͻ��˵�����
						socket = serverSocket.accept();
						//���뼯��
						socketList.add(socket);
						System.out.println("�ͻ��� " + socket.getInetAddress().getHostAddress() + "���ӳɹ���");
	 
						// showHello(socket);
						//Ϊ�ÿͻ��˷ֱ���һ��������Ϣ�̺߳ͽ�����Ϣ�߳�
						new Thread(new SendThread(socket,socketList)).start();
						new Thread(new RecevieThread(socket, socketList)).start();
	 
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}
		
	}
		
}	


