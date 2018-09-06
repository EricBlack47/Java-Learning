package neibulei;

public class MainTest {
	
	private int x=6;
	private static int x1=66;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	//非静态内部类
	public class Inner1{
		private int y;

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		public void show() {
			System.out.println(x+" "+y);
		}
	
	}
	
	public static class Inner2{
		private static int y;

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		public void show() {
			System.out.println(x1+" "+y);
		}
		
	public abstract class Inner4{
		public void eat() {
			System.out.println("吃！");
		}
	}
	}
}
