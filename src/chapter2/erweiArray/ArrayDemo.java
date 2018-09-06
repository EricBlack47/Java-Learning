package chapter2.erweiArray;

public class ArrayDemo {
	public static void main(String[] args) {
		//杨辉三角
		
		int[][] a = new int[5][5];/*
		 * for (int i = 0; i < a.length; i++) { for (int j = 0; j <= i; j++) { if (i ==j
		 * || j == 0) a[i][j] = 1; else a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
		 * System.out.print(a[i][j] + " "); } System.out.println();
		 
		/*方法二
		int[][] a = new int[5][5];
		for (int i = 0; i < a.length; i++) {
			a[i][0] = a[i][i] = 1;
		}
		for (int i = 2; i < a.length; i++) {
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}
		out(a);
		*/
	}

	/**
	 * @param a
	 */
	private static void out(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
	
}
