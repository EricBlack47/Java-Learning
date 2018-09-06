package chapter13.sendfile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class FileSender extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tField;
	private JProgressBar pBar;
	private Socket s;

	public FileSender() {
		setTitle("文件发送");
		setSize(700, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(500, 200);
		setLayout(null);
		JLabel label = new JLabel("选择文件");
		tField = new JTextField();
		JButton button = new JButton("打开");
		label.setBounds(100, 50, 60, 25);
		tField.setBounds(180, 50, 250, 25);
		button.setBounds(450, 50, 60, 25);
		add(label);
		add(tField);
		add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int f = fileChooser.showOpenDialog(null);
				if (f == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					tField.setText(file.getPath());
				}
			}
		});

		pBar = new JProgressBar(0, 100);
		pBar.setStringPainted(true);
		pBar.setValue(0);
		pBar.setBounds(150, 200, 300, 25);
		add(pBar);
		JButton sendBtn = new JButton("发送");
		sendBtn.setBounds(200, 300, 200, 25);
		add(sendBtn);
		sendBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

					try {
						s=new Socket("192.168.31.132",2333);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							try {
								String fileName=tField.getText();
								File file=new File(fileName);
								String fn=file.getName();
								PrintStream out=new PrintStream(s.getOutputStream());
								out.println(fn);
								out.flush();
								FileInputStream fis=new FileInputStream(fileName);
								BufferedInputStream bis=new BufferedInputStream(fis);
								BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
								byte [] bs=new byte[8192];
								int len;
								long fileSize=file.length();
								long transeSize=0;
								while((len=bis.read(bs))!=-1) {
									bos.write(bs, 0, len);
									transeSize+=len;
									pBar.setValue((int)(1.0*transeSize/fileSize*100));
									bos.flush();
								}
								System.out.println("completed!");					    
								bis.close();bos.close();
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				}).start();
			}
		});

	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new FileSender();
			}
		});
	}	
}	
