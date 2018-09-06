package chapter2.tiaoshi;

import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		int a, b;
		System.out.println("请输入两个整数: ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		int s;
		s = avg(a, b);
		System.out.println("平均值为: " + s);
		int t;
		t = sum(a, b);
		System.out.println("合为: " + t);
		scanner.close();
	}

	private static int sum(int a, int b) {
		int z = a + b;
		return z;
	}

	public static int avg(int a, int b) {
		int z = (a + b) / 2;
		return z;
	}

}
