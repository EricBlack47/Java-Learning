package chapter8.exception;

public class ClaszHomeWork {

	public static void main(String[] args) {
		System.out.println("-------------��ѧ�쳣-------------------");	
		int x, y;
		x = 5;
		y = 0;
		int z;
		try {
			z = x / y;
			System.out.println("z= " + z);		
		} catch (ArithmeticException e) {
			System.out.println("����Ϊ0");
		}
	System.out.println("-------------Խ���쳣-------------------");		
		String friends[] = { "lisa", "bily", "kessy" };
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(friends[i]); // friends[4]?
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("can't found this guy");
			}
		}
		System.out.println("-------------���ָ�ʽ�쳣-------------------");		
		int a=1;
		double b;
		
		
		
	}
}
