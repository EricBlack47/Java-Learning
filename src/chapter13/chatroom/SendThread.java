package chapter13.chatroom;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class SendThread implements Runnable{
	Socket socket;
	PrintWriter pWriter;// ʹ��printwriter������ͻ��˷���Ϣ��Ҳ������������
	private ArrayList<Socket> socketlist;// �����������̵߳Ŀͻ���

	Scanner sc = new Scanner(System.in);// �Ӽ���������Ϣ

	public SendThread(Socket socket, ArrayList<Socket> socketlist) {
		super();
		this.socket = socket;
		this.socketlist = socketlist;
		// ����socket���ֽ����������OutputStreamWriter���ֽ������ת��Ϊ�ַ������ٴ���PrintWriter
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
			String msg = socket.getInetAddress().getHostAddress() + ":" + sc.nextLine();// �Ӽ��������ȡ��Ϣ
			if (msg == "b") {
				break;
			}

			// �ѷ������ܵ�����Ϣ���������ͻ���
			for (Socket clientsocket : socketlist) {
				PrintWriter pWriter;
				try {
					// ��ȡsocket���������������ͻ��˷�����Ϣ
					pWriter = new PrintWriter(clientsocket.getOutputStream());
					pWriter.println(msg);// ����ͻ�����Ϣ
					pWriter.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
