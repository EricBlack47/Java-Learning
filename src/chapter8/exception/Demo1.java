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
		System.out.print("请输入两个整数：");
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			int z;
			try {
				z = x / y;
				System.out.println("z= " + z);
			} catch (Exception e) {
				System.out.println("除数不能为0");
			}
		} catch (Exception e) {
			System.out.println("您输入数据有误！");
		}
		/*
		 * catch (Exception e) { if (e instanceof InputMismatchException) {
		 * System.out.println("不是整数怎么除？"); } if (e instanceof ArithmeticException) {
		 * System.out.println("除数为0怎么除？"); } }
		 */
		/*
		 * catch (InputMismatchException e) { System.out.println("不是整数怎么除？"); } catch
		 * (ArithmeticException e) { System.out.println("除数为0怎么除？"); }
		 */
		sc.close();
		System.out.println("运行结束");
	}

}
