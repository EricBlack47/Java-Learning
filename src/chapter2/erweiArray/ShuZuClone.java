package chapter2.erweiArray;

public class ShuZuClone {

	public static void main(String[] args) {
		// 一维数组克隆
		int[] a = { 1, 2, 3 };
		int[] b = a.clone();
		b[1] = 4;
		out(a);
		System.out.println("\r" + "-----一维数组克隆------");
		out(b);

		// 二维数组克隆
		System.out.println("\r" + "-----------------");
		int[][] c = new int[3][3];
		int[][] d = c.clone();
		out(c);
		System.out.println("-------二维数组克隆----------");
		for (int i = 0; i < a.length; i++) {
			d[i] = c[i].clone();
		}
		d[0][2] = 9;
		d[1][2] = 8;
		out(d);
	}

	/**
	 * @param a
	 */
	private static void out(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + " ");		
		}
		System.out.println();
	}

	private static void out(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
