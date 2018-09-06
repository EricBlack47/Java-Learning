package chapter9.generic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String name;
	private Date brithday;
	private int age;
	protected String school;
	


	public Person() {	
		System.out.println("hello");
	}
	
	public Person(String name) {		
		this.name=name;
		System.out.println("tom");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBrithday() {
		return brithday;
	}

	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyÄêMÔÂdÌì");
		return "Person [name=" + name + ", brithday=" + brithday + ", age=" + age +sdf.format(age)+"]";
	}

	public void hello() {
		System.out.println("hello");
		
	}

	public void setJob() {
		System.out.println("ww");
	}
	

}