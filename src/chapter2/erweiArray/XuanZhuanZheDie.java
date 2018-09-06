package chapter2.erweiArray;

import java.util.Random;

public class XuanZhuanZheDie {

	public static void main(String[] args) {
		int a[][] = new int[4][4];
		setRandom(a);
		out(a);
//		System.out.println("----ÖÃ»»----");
//		// ÖÃ»»
//		zhiHuan(a);
//		out(a);
		//ÕÛµş
		System.out.println("----ÕÛµş----");
		zheDie(a);
		out(a);		
	}

	/**
	 * @param a
	 */
	private static void zheDie(int[][] a) {
		for (int i = 0; i < a.length/2; i++) {
			for (int j = 0; j < a.length; j++) {
				int d;
				d=a[i][j];
				a[i][j]=a[a.length-i-1][j];
				a[a.length-1-i][j]=d;						
			}			
		}
	}

	/**
	 * ÖÃ»»
	 * @param a
	 */
	private static void zhiHuan(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				int c;
				c = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = c;
			}
		}
	}

	/**
	 * Êä³ö
	 * @param a
	 */
	private static void out(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}

	/**
	 * Éú³ÉËæ»ú¶şÎ¬Êı×é
	 * 
	 * @param a
	 */
	private static void setRandom(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = new Random().nextInt(10);
			}
		}
	}
}
