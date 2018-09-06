package chapter11.io;

import java.util.Scanner;

public class Hanoilam {
		//µÝ¹éººÅµËþ½â·¨
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÅÌ×ÓÊý: ");
		int x=sc.nextInt();
	    hanoi(x, 'a', 'b', 'c');
	    sc.close();
	}
	public static void hanoi(int x, char a, char b, char c) {
		if(x==1) {
			System.out.println(a+"==>"+c);
		}
		else {
			hanoi(x-1,a,c,b);
		System.out.println(a+"==>"+c);
		    hanoi(x-1,b,a,c);
		}
	}
}
