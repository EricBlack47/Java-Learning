package chapter11.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {
	
	public static void main(String[] args) {
		
		try {
			InputStream in =InputStreamReaderTest.class.getResourceAsStream("test.txt");
			InputStreamReader isr=new InputStreamReader(in,"GBK");
			int ch;
			while((ch=isr.read())!=-1) {
				System.out.print((char)ch);
			}
			isr.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
