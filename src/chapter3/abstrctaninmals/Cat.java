package chapter3.abstrctaninmals;

public class Cat extends Animals{
	
	public void Hit() {
		System.out.println("Want Some Slash???Take it!");
	}
	
	public Cat() {
		
	}
	
	public Cat(String name,int age) {
		super();
	}

	@Override
	public void eat() {
		System.out.println("cats takes fish");
		
	}

	@Override
	public String toString() {
		return "Cat [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

}
