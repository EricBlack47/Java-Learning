package chapter13.chatroom;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerRoom {
	public static ArrayList<Socket> socketList = new ArrayList<>();

	public static void main(String[] args) {
		try {
			// 新建一个服务端ServerSocket，锁定端口号为2，端口号建议锁定大一点的
			ServerSocket serverSocket = new ServerSocket(2333);
			System.out.println("等待客户端连接...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (true) {
			try {
				ServerSocket serverSocket = null;
				// 监听客户端的连接
				Socket socket = serverSocket.accept();
				// 加入集合
				socketList.add(socket);
				System.out.println("客户端 " + socket.getInetAddress().getHostAddress() + "连接成功！");

				// showHello(socket);
				// 为该客户端分别开启一个发送信息线程和接收信息线程
				new Thread(new SendThread(socket, socketList)).start();
				new Thread(new RecevieThread(socket, socketList)).start();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
