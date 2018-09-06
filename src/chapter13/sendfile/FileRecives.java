package chapter13.sendfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class FileRecives {
	public static void main(String[] args) {	
		try {
			ServerSocket ss=new ServerSocket(2333);
			Socket s=ss.accept();
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String fn=br.readLine();
			BufferedInputStream bis=new BufferedInputStream(s.getInputStream());
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d:\\"+fn));
			byte[] bs=new byte[8192];
			int len;
			while((len=bis.read(bs))!=-1) {
				System.out.println("recive"+len+"bit");
				bos.write(bs,0,len);
			}
			System.out.println("succssed");
			bis.close();bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
