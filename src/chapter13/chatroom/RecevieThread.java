package chapter13.chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class RecevieThread implements Runnable {
	// 接收信息的线程
	Socket socket;
	BufferedReader br;
	private ArrayList<Socket> socketlist;

	public RecevieThread(Socket socket, ArrayList<Socket> socketlist) {
		super();
		this.socket = socket;
		this.socketlist = socketlist;
		// 获取socket输出流
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			String msg;
			try {
				msg = br.readLine();
				System.out.println(msg);

				for (Socket clientsocket : socketlist) {
					PrintWriter pWriter = new PrintWriter(clientsocket.getOutputStream());
					pWriter.println(msg);
					pWriter.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
