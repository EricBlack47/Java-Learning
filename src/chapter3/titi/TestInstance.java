package chapter3.titi;

public class TestInstance {
	public static void main(String[] args) {
		SingleDemo s1=SingleDemo.getInstance();
		SingleDemo s2=SingleDemo.getInstance();
		SingleDemo s3=SingleDemo.getInstance();
		SingleDemo s4=SingleDemo.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	
}
