package chapter3.extendz;



public class Student extends Person {
	
	public Student() {
		super("");
		System.out.println("everyone");		
	}
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public void hello() {
		System.out.println("hello mates");
	}
	
	

}
