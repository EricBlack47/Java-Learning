package chapter5.neibulei;

public class Student {
	
	protected String School;
	private String name;
	private int age;
	private String date;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [School=" + School + ", name=" + name + ", age=" + age + ", date=" + date + "]";
	}
	public Student(String school, String name, int age, String date) {
		super();
		School = school;
		this.name = name;
		this.age = age;
		this.date = date;
	}
	
	

}
