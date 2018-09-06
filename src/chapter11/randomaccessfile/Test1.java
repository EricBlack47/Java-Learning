package chapter11.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf=new RandomAccessFile("e:\\rr.txt", "rw");
		raf.seek(12);
		byte[] buf=new byte[2];
		raf.read(buf);
		String s=new String(buf);
		System.out.println(s);
		raf.seek(0);
		raf.read(buf);
		s=new String(buf);
		System.out.println(s);
		raf.seek(15);
		raf.write("99".getBytes());
		raf.seek(15);
		raf.read(buf);
		s=new String(buf);
		System.out.println(s);
		raf.close();
	}

}
