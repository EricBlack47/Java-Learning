package chapter8.exception;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		try {
			int a=Demo3.divide(3, 0);			
		}
		catch(DivideException e) {
			e.printStackTrace();
			System.out.println(e instanceof Exception);
			System.out.println(e instanceof DivideException);			
			System.out.println(e.getMessage());
		}
					
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("����������������");
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			int z;
			try {
				z = x / y;
				System.out.println("z= " + z);
			} catch (Exception e) {
				System.out.println("��������Ϊ0");
			}
		} catch (Exception e) {
			System.out.println("��������������");
		}
		/*
		 * catch (Exception e) { if (e instanceof InputMismatchException) {
		 * System.out.println("����������ô����"); } if (e instanceof ArithmeticException) {
		 * System.out.println("����Ϊ0��ô����"); } }
		 */
		/*
		 * catch (InputMismatchException e) { System.out.println("����������ô����"); } catch
		 * (ArithmeticException e) { System.out.println("����Ϊ0��ô����"); }
		 */
		sc.close();
		System.out.println("���н���");
	}

}
