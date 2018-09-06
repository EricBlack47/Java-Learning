package neibulei;

public class InnerClazzTest {
	public static void main(String[] args) {
		/**
		 * 非静态内部类测试
		 */
		MainTest mt = new MainTest();// 创建外部类对象
		MainTest.Inner1 i1 = mt.new Inner1();// 创建内部类对象
		i1.show();
		System.out.println(mt.getX());
		System.out.println(i1.getY());

		/**
		 * 静态内部类测试 
		 * 静态内部类只能访问外部静态成员，创建内部类对象时不用创建外部类对象
		 */
		MainTest.Inner2 i2 = new MainTest.Inner2();
		i2.show();

		
		// 内部类（无修饰符或匿名）
		class Inner3{
			int x;
		}	
		Inner3 a=new Inner3();
		a.x=7;
		System.out.println(a.x);
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
		};
	}
}
