package chapter11.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		
		File file1=new File("e:\\aa.rar");
		File file2=new File("d:\\aa.rar");
		
		try {
			FileInputStream fis=new FileInputStream(file1);
			FileOutputStream fos=new FileOutputStream(file2);
			BufferedInputStream bis1=new BufferedInputStream(fis);
			BufferedOutputStream bos2=new BufferedOutputStream(fos);
			byte[] buf=new byte[8192];
			int len;
			long start=System.currentTimeMillis();
			while((len=bis1.read(buf))!=-1) {
				//System.out.println((char)len);
				bos2.write(buf,0,len);	
			}
			long end=System.currentTimeMillis();
			fis.close();fos.close();
			System.out.println((end-start)+"∫¡√Î");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
