package ppttest;

public class OrderTest {
	public static void main(String[] args) {
		Order o1=new Order(123,"cat");
		Order o2=new Order(123,"cat");
		System.out.println(o1.equals(o2));
	
	}

}
