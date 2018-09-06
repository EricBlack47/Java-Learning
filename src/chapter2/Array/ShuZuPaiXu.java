package chapter2.Array;

import java.util.Random;

public class ShuZuPaiXu {
	public static void main(String[] args) {	
		int i;
		int[] a = new int[10];
		
		// —°‘Ò≈≈–Ú
		random(a);
		out(a);
		simpleSelecteMethod(a);
		out(a);
		// √∞≈›≈≈–Ú
		bubblingMethod(a);
		out(a);
		// ≤Â»Î≈≈–Ú
		putInMethod(a);
		out(a);
	}

	/**
	 * ≤Â»Î≈≈–Ú
	 * 
	 * @param a
	 * @return
	 */
	private static int putInMethod(int[] a) {
		int i;
		for (i = 1; i < a.length; i++) {
			int t = a[i];
			int j;
			for (j = i - 1; i >= 0 && t < a[j]; j--)
				a[j + 1] = a[j];
			a[j + 1] = t;
		}
		return i;
	}

	/**
	 * √∞≈›≈≈–Ú
	 * 
	 * @param a
	 * @return
	 */
	private static int bubblingMethod(int[] a) {
		int i;
		for (i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int p = a[j];
					a[j] = a[j + 1];
					a[j + 1] = p;
				}
			}
		}
		return i;
	}

	/**
	 * ºÚµ•—°‘Ò≈≈–Ú
	 * 
	 * @param a
	 * @return
	 */
	private static int simpleSelecteMethod(int[] a) {
		int i;
		for (i = 0; i < a.length - 1; i++) {
			int p = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[p])
					p = j;
			}
			int t;
			t = a[i];
			a[i] = a[p];
			a[p] = t;
		}
		return i;
	}

	/**
	 *  ‰≥ˆ
	 * 
	 * @param a
	 * @return
	 */
	private static int out(int[] a) {
		int i;
		for (i = 1; i < a.length; i++) {
			System.out.print(a[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println();
				
			}
		}
		return i;
	}

	/**
	 * …˙≥…ÀÊª˙ ˝◊È
	 * 
	 * @param a
	 * @return
	 */
	private static int random(int[] a) {
		int i;
		for (i = 0; i < a.length; i++) {
			Random random = new Random();
			a[i] = random.nextInt(100);
		}
		return i;
	}
}
