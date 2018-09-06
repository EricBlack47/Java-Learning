package chapter2.Array;

public class TestDemo {
	public static void main(String[] args) {
		int[] a = new int[5];
		double[] b = new double[5];
		char[] c = new char[5];
		boolean[] d = new boolean[5];
		a[0] = 1;
		int[] x = a;
		x[2] = 888;

		double[] e = b;
		e[4] = 3.12;

		char[] z = c;
		z[1] = 'a';

		boolean[] g = d;
		g[3] = true;

		out(a);
		System.out.println("\r");
		out(b);
		System.out.println("\r");
		out(c);
		System.out.println("\r");
		out(d);

	}

	/**
	 * @param a
	 */
	private static void out(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void out(double[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	private static void out(char[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.print((int) c[i] + " ");
		}
	}

	private static void out(boolean[] d) {
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
	}

}
