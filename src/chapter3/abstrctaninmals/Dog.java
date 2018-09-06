package chapter3.abstrctaninmals;

public class Dog extends Animals{
	
	public void Bite() {
		System.out.println("Fuck U!Bite U!");
	}
	
	
	
	public Dog() {
		
	}
	
	public Dog(String name,int age) {
		super(name,age);
	}
	

	@Override
	public void eat() {
		System.out.println("dogs are suks!fuck off!");
		
	}

	@Override
	public String toString() {
		return "Dog [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	

}
