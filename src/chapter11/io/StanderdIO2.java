package chapter11.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StanderdIO2 {
	//输出文件内容
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("e:\\test.txt");
		System.setIn(fis);
		int num=0;
		byte[] buf=new byte[20];
		int a=fis.read(buf);
		System.out.println(a);
		for(int i=0;i<a;i++) {
			if(Character.isDigit(buf[i])) {
				num=num*10+buf[i]-48;
			}
			else
				break;
		}
		FileOutputStream fos=new FileOutputStream("e:\\aa.txt");
		System.setOut(new PrintStream(fos));
		System.out.println("您输入的数字为:"+num);
	}

}
