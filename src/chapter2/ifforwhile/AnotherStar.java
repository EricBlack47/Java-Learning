package chapter2.ifforwhile;

public class AnotherStar {
	public static void main(String[] args) {

		for (int x = -3; x < 4; x++) {
			for (int j = 0; j < Math.abs(x); j++)
				System.out.print(" ");
			for (int k = 0; k < 7 - 2 * Math.abs(x); k++)
				if (k == 0 || k == 7 - 2 * Math.abs(x) - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.print("\n");
		}
		System.out.println();
	}
}