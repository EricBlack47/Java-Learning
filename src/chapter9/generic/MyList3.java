package chapter9.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import neibulei.Student;

public class MyList3 {
	public static void main(String[] args) {
		
		List<? extends Number> l=new ArrayList<>();
		List<Long> l1=new ArrayList<>();
		List<Double> l2=new ArrayList<>();
		List<Short> l3=new ArrayList<>();
		List<Integer> l4=new ArrayList<>();
		List<Byte> l5=new ArrayList<>();
		
		Collection<? extends Person> c=new ArrayList<>();
		Collection<Student> c1=new ArrayList<>();
	}

}
