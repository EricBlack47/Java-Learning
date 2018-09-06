package chapter2.Array;

import java.util.Random;

/**
 * 二维数组每行的合
 * 
 * @author Administrator
 *
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		/*
		 * int[][] a = new int[3][5]; setRandom(a); out(a); int[] b = new int[3]; int
		 * sum = 0; erWeiShuZuQiuHe(a, b); out(b);
		 */

		// 数组转置
		int[][] c = new int[3][3];
		setRandom1(c);
		out1(c);
		//System.out.println("------转置-----------");
		//zhuanZhi(c);
		//out1(c);
		// 折叠
		System.out.println("------折叠-----------");
		zheDie(c);
		out1(c);
		// 旋转90°（）
		/*System.out.println("------旋转90°-----------");		
		zheDie(c);
		zhuanZhi(c);
		out1(c);*/
	}


	
	
	/**
	 * 转质
	 * 
	 * @param c
	 */
	private static void zhuanZhi(int[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < i; j++) {
				int d;
				d = c[i][j];
				c[i][j] = c[j][i];
				c[j][i] = d;
			}
		}
	}

	/**
	 * 折叠
	 * 
	 * @param c
	 */
	private static void zheDie(int[][] c) {
		for (int i = 0; i < c.length / 2; i++) {
			for (int j = 0; j < c.length; j++) {
				int d;
				d = c[i][j];
				c[i][j] = c[c.length - i - 1][j];
				c[c.length - 1 - i][j] = d;
			}
		}
	}

	/**
	 * 求和
	 * 
	 * @param a
	 * @param b
	 */
	private static void erWeiShuZuQiuHe(int[][] a, int[] b) {
		int sum;
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = 0; j < 5; j++) {
				sum += a[i][j];
			}
			b[i] = sum;
		}
	}

	/**
	 * 设随机数
	 * 
	 * @param a
	 */
	private static void setRandom(int[][] a) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				Random random = new Random();
				a[i][j] = random.nextInt(10);
			}
		}
	}

	private static void setRandom1(int[][] b) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Random random = new Random();
				b[i][j] = random.nextInt(10);
			}
		}
	}

	/**
	 * 输出
	 * 
	 * @param a
	 */
	private static void out(int[][] a) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void out(int[] b) {
		for (int i = 0; i < 3; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
	}

	private static void out1(int[][] c) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
