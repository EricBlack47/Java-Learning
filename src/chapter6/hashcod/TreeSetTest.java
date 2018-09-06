package chapter6.hashcod;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<Student> stack=new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
			    if(!o1.getName().equals(o2.getName())) {
			    	return o1.getName().compareTo(o2.getName());
			    }
				return o2.getAge()-o1.getAge();
			}
	});	
		Student s1=new Student("aa", 20);
		Student s2=new Student("bb", 18);
		Student s3=new Student("cc", 22);
		Student s4=new Student("dd", 17);
		stack.add(s1);
		stack.add(s2);
		stack.add(s3);
		stack.add(s4);
        for (Student student : stack) {
        	System.out.println(student);		
		}
}
}