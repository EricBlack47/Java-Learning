package chapter11.io;

import java.io.IOException;
import java.io.InputStream;

public class StandardIO {
	//����Scanner�����������
	public static void main(String[] args) throws IOException {
		InputStream is=System.in;
		System.out.println("����������:");
		int num=0;
		byte[] buf=new byte[20];
		int a=is.read(buf);
		System.out.println(a);
		for(int i=0;i<a;i++) {
			if(Character.isDigit(buf[i])) {
				num=num*10+buf[i]-48;
			}
			else
				break;
		}
		System.out.println("���������Ϊ:"+num);
	}

}
