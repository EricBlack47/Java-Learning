package chapter11.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIO3 {
	//����Scanner���������ַ���
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������ַ�����");
		String s=br.readLine();
		System.out.println("���ղ�������ǣ�"+s);
	}

}
