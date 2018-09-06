package chapter11.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test2SetCode {

	public static void main(String[] args) throws IOException {
		//��^���ļ�����
		RandomAccessFile raf = new RandomAccessFile("e:\\code.txt", "rw");
		byte[] buf = new byte[10];
		int len;
		int key = 99;
		while ((len = raf.read(buf)) != -1) {  //ѭ��λ�Ƽ���
			for (int i = 0; i < len; i++) {
				buf[i] ^= key;
			}
			long pos = raf.getFilePointer();
			raf.seek(pos - len);
			raf.write(buf, 0, len);
		}
		raf.close();
	}
}
