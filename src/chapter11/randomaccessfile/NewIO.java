package chapter11.randomaccessfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class NewIO {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("d:\\aa.rar");
		FileOutputStream fos=new FileOutputStream("e:\\a.rar");
		FileChannel in=fis.getChannel();
		FileChannel out=fos.getChannel();
		//in.transferTo(0, in.size(),out);//ͨ��in�ķ���
		out.transferFrom(in, 0, in.size());//ͨ��out�ķ���
		in.close();
		out.close();
		System.out.println("���Ƴɹ�");
		
	}

}
