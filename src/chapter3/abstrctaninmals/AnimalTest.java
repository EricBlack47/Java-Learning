package chapter3.abstrctaninmals;

public class AnimalTest {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.setName("AssKicker");
		d.setAge(999);
		System.out.println(d);
		d.eat();
		d.Bite();
		Cat c=new Cat();
		c.setName("Tom");
		c.setAge(666);
		System.out.println(c);
		c.eat();
		c.Hit();
	}

}
