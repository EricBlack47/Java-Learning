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
		//in.transferTo(0, in.size(),out);//通过in的方法
		out.transferFrom(in, 0, in.size());//通过out的方法
		in.close();
		out.close();
		System.out.println("复制成功");
		
	}

}
