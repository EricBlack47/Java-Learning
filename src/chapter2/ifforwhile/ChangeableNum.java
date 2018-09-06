package chapter2.ifforwhile;

public class ChangeableNum {
	public static void main(String[] args) {
		ChangeableNum m = new ChangeableNum();
		System.out.println(m.max(5, 7));
		System.out.println(m.max(5.5, 7.7, 6.6));
		System.out.println(m.max(5, 7, 6, 9, 8));
		ChangeableNum.methodOne(7);

	}

	public static void methodOne(int a) {
		int x = a * a;
		System.out.println(x);
	}

	public int max(int a, int b) {
		return a > b ? a : b;

	}

	public double max(double c, double d, double e) {
		double n = c;
		if (d > n)
			n = d;
		if (e > n)
			n = e;
		return n;

	}

	public int max(int... a) {
		int z = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > z)
				z = a[i];
		}
		return z;
	}
}
