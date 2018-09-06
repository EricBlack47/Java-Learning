package chapter13.chatroom;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class SendThread implements Runnable{
	Socket socket;
	PrintWriter pWriter;// 使用printwriter流来向客户端发信息，也可以用其他流
	private ArrayList<Socket> socketlist;// 接收来自主线程的客户端

	Scanner sc = new Scanner(System.in);// 从键盘输入信息

	public SendThread(Socket socket, ArrayList<Socket> socketlist) {
		super();
		this.socket = socket;
		this.socketlist = socketlist;
		// 接收socket的字节输出流，用OutputStreamWriter把字节输出流转化为字符流，再传给PrintWriter
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
			String msg = socket.getInetAddress().getHostAddress() + ":" + sc.nextLine();// 从键盘输入获取信息
			if (msg == "b") {
				break;
			}

			// 把服务器受到的信息发给各个客户端
			for (Socket clientsocket : socketlist) {
				PrintWriter pWriter;
				try {
					// 获取socket的输出流，用来向客户端发送消息
					pWriter = new PrintWriter(clientsocket.getOutputStream());
					pWriter.println(msg);// 输出客户端信息
					pWriter.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
