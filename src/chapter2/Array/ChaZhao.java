package chapter2.Array;

import java.util.Random;
import java.util.Scanner;

public class ChaZhao {
	public static void main(String[] args) {
		int i;
		// 生成随机数
		int[] a = new int[10];
		setRandomValue(a);
		out(a);
        //让用户输入一个数查角标
		Scanner sc = new Scanner(System.in);
		System.out.print("\r" + "请输入一个数: ");
		int s1;
		s1 = sc.nextInt();
		// 查找角标
		i = indexFound(a, s1);
		System.out.println(i);
		// 求平均值
		int avg = findAvg(a);
		System.out.println("平均值为:" + avg);
		// 求合
		int s = sum(a);
		System.out.println("合为:" + s);
	}

	/**
	 * @param a      求和
	 * @param random
	 * @return
	 */
	private static int sum(int[] a) {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}

	/**
	 * @param a      求平均值
	 * @param random
	 * @return
	 */
	private static int findAvg(int[] a) {
		int s = 0, avg = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		avg = s / a.length;
		return avg;
	}

	/**
	 * @param a 生成随机数组
	 * @return
	 */
	private static void setRandomValue(int[] a) {
		int i;
		for (i = 0; i < a.length; i++) {
			Random random = new Random();
			a[i] = random.nextInt(100);
			System.out.print(a[i] + "\t");
		}
	}

	/**
	 * @param a 输出
	 * @return
	 */
	private static void out(int[] a) {
		int i;
		for (i = 0; i < a.length; i++) {
		}
	}

	/**
	 * @param a 查找角标
	 * @param s
	 * @return
	 */
	private static int indexFound(int[] a, int s1) {
		int i;
		int result = -1;
		for (i = 0; i < a.length; i++) {
			if (s1 == a[i]) {
				result = i;
				break;
			}
		}
		return result;
	}
}