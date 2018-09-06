package chapter2.ifforwhile;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		int x, y;
		String s = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数: ");
		x = sc.nextInt();
		do {
			y = x % 16;
			x = x / 16;
			

			switch (y) {
			case 10:
				s = "A" + s;
				break;
			case 11:
				s = "B" + s;
				break;
			case 12:
				s = "C" + s;
				break;
			case 13:
				s = "D" + s;
				break;
			case 14:
				s = "E" + s;
				break;
			case 15:
				s = "F" + s;
				break;
			default:
				s = y + s;
				break;
			}
		} while (x != 0);
		System.out.println(s);

	}
}
	

