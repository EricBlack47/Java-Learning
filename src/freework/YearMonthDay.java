package freework;

import java.util.Scanner;

public class YearMonthDay {
	public static void main(String[] args) {

		int y, m, d, days;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年月日: ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		days = (y - 1900) * 365;
		for (int i = 1900; i < y; i++) {
			// year
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
				days++;
		}
		// month
		for (int i = 1; i < m; i++) {
			if (i == 2)
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
					days += 29;
				else
					days += 28;
			else if (i == 4 || i == 6 || i == 9 || i == 11)
				days += 30;
			else
				days += 31;
		}
		days += d;
		System.out.println("今天是星期:" + days % 7);

	}
}