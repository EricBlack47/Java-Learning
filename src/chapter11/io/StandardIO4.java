package chapter11.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class StandardIO4 {
	
	public static void main(String[] args) throws IOException {
		
		int a=987654;
		//д�ı��ļ�(�����ֽ�)
		PrintStream ps=new PrintStream(new FileOutputStream("e:\\bb.txt"));
		ps.println(a);
		ps.close();
		//���ı��ļ�
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("e:\\bb.txt")));
		String s=br.readLine();
		int a2=Integer.valueOf(a);
		System.out.println(a2);br.close();
		
		//д�������ļ�(�ĸ��ֽ�)
		DataOutputStream dos= new DataOutputStream(new FileOutputStream("e:\\aa.txt"));
		dos.write(a);
		dos.close();
		//���������ļ�
		DataInputStream dis =new DataInputStream(new FileInputStream("e:\\cc.txt"));
		int a1=dis.readInt();
		System.out.println(a1);dis.close();
	}
}
