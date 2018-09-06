package chapter2.Array;

public class TestArray {
	public static void main(String[] args) {
		int[] array1 = { 2, 3, 5, 7, 11, 13, 17, 19 };
		int[] array2;
		out(array1);
		System.out.println("\r" + "-------------------");
		array2 = array1;
		for (int i = 0; i < array2.length; i++) {
			if (i % 2 == 0)
				array2[i] = i;
		}
		out(array1);
	}

	/**
	 * @param array1
	 */
	private static void out(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}
}