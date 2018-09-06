package chapter13.chatroom2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ChatRoomGUI extends JFrame {

	/**
	 * 聊天室界面
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea chatInfo;
	private JTextField sendInput;
	private Socket socket;

	public ChatRoomGUI() {
		try {
			socket = new Socket("192.168.1.100", 2233);
			setTitle("聊天窗口");
			setSize(700, 500);
			setLocation(500, 200);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			chatInfo = new JTextArea();
			JScrollPane sp = new JScrollPane(chatInfo);
			add(sp);
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						while (true) {
							String recive = br.readLine();
							chatInfo.append(recive + "\n");
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}).start();
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			sendInput = new JTextField();
			panel.add(sendInput);
			JButton btn = new JButton("发送");
			panel.add(btn, BorderLayout.EAST);
			add(panel, BorderLayout.SOUTH);
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String message = sendInput.getText();
					if (message == null || message.trim().equals("")) {
						JOptionPane.showMessageDialog(null, "不能发送空消息");
						return;
					}
					try {
						PrintWriter out = new PrintWriter(socket.getOutputStream());
						out.println(message);
						out.flush();
						sendInput.setText("");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ChatRoomGUI();

			}
		});
	}

}
