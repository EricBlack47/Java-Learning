package chapter8.exception;

public class Demo2 {
	public static void main(String[] args) {
		String friends[] = { "lisa", "bily", "kessy" };
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(friends[i]); // friends[4]?
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("can't found this guy");
			}
		}
		System.out.println("\nthis is the end");
	}
}
