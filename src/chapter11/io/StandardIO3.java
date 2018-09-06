package chapter11.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIO3 {
	//不用Scanner方法输入字符串
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入字符串：");
		String s=br.readLine();
		System.out.println("您刚才输入的是："+s);
	}

}
