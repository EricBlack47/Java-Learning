package chapter2.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuZuZongHe {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		// 生成随机数组
		int[] a = new int[10];
		setRandomValue(a);
		out(a);
		// 让用户输入一个数查下标
		System.out.print("\r" + "请输入一个数: ");
		int s1;
		s1 = sc.nextInt();
		// 查找下标
		i = indexFound(a, s1);
		System.out.println(i);
		// 求平均值
		int avg = findAvg(a);
		System.out.println("平均值为:" + avg);
		// 求合
		int s = sum(a);
		System.out.println("合为:" + s);
		// 插入数组
		System.out.println("请输入要插入的位置和值:");
		int p, v;
		p = sc.nextInt();
		v = sc.nextInt();
		a = Arrays.copyOf(a, a.length + 1);
		putIn(a, p, v);
		out(a);
		// 删除数组中的数
		System.out.println("\r" + "请输入要删除的位置:");
		int x;
		x = sc.nextInt();
		cutOff(a, x);
		a = Arrays.copyOf(a, a.length - 1);
		out(a);
	}

	/**
	 * 删除
	 * 
	 * @param a
	 * @param x
	 */
	private static void cutOff(int[] a, int x) {
		int i1;
		for (i1 = x; i1 < a.length - 1; i1++) {
			a[i1] = a[i1 + 1];
		}
	}

	/**
	 * 插入
	 * 
	 * @param a
	 * @param p位置
	 * @param v值
	 */
	private static void putIn(int[] a, int p, int v) {
		int i;
		for (i = a.length - 1; i > p; i--) {
			a[i] = a[i - 1];
		}
		a[p] = v;
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
		}
	}

	/**
	 * @param a 输出
	 * @return
	 */
	private static void out(int[] a) {
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println();
				}
			}
		
		
	}

	/**
	 * @param a 查找下标
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
