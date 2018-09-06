package freework;

import java.util.Calendar;
import java.util.Scanner;

public class MadeCalendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份: ");
		int year = sc.nextInt();
		System.out.println("请输入月份: ");
		int month = sc.nextInt();
		System.out.println("请输入日期: ");
		int day = sc.nextInt();
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DATE, 1);
		c.roll(Calendar.DATE, -1);
		int numDays = c.get(Calendar.DATE);
		c.set(Calendar.DATE, 1);
		int n = c.get(Calendar.DAY_OF_WEEK);
		System.out.println();
		System.out.println("\t \t" + year + "年" + month + "月"+day+"日");
		System.out.print("周日\t周一\t周二\t周三\t周四\t周五\t周六");
		System.out.println();
		for (int i = 1; i <= n - 1; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= numDays; i++) {
			if (i == day) {
				System.out.print(i + "*\t");
			} else {
				System.out.print(i + "\t");
				if ((i + n - 1) % 7 == 0) {
					System.out.println();
				}
			}
		}
		sc.close();
	}

}
