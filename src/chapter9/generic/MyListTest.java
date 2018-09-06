package chapter9.generic;

import neibulei.Student;

public class MyListTest {
	
	public static void main(String[] args) {
		
		MyList<String> m1=new MyList<>(5);
		m1.set("Tom");
		m1.set("and");
		m1.set("Jerry");
		System.out.println
		(m1.get(0));
		m1.print();
		
		System.out.println("---------------------------");	
		MyList<Student> s1=new MyList<>(3);
		s1.set(new Student("财经大学","老丹",22,"1996"));
		s1.set(new Student("西南林大","老韩",23,"1995"));
		s1.print();
		
		System.out.println("----------------------------");
		
	}

}
