package chapter3.buyticks;

public class Test {
	public static void main(String[] args) {
		TicksPtoxy tp=new TicksPtoxy();
		Person p1=new Person();
		tp.setCustomer(p1);
	    tp.buyticks();
		System.out.println("----------------");
	    Student s1=new Student();
	    tp.setCustomer(s1);
	    tp.buyticks();
	}

}
