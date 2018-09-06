package chapter6.string;

public class TamplateDemo {
	public static void main(String[] args) {
		long t1 = new StringTemplate() {

			@Override
			public void code() {
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < 100000; i++) {
					sb.append(i);
				}
				System.out.println(sb);
			}
		}.getTime();

		long t2 = new StringTemplate() {
			@Override
			public void code() {
				String sb = "";
				for (int i = 0; i < 100000; i++) {
					sb += i;
				}
				System.out.println(sb);
			}
		}.getTime();
		;
		System.out.println("t1=" + t1 + ",t2=" + t2);
	}
}