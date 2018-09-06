package chapter4.implemenz;

public class Test {
	public static void main(String[] args) {
		RunnerManager r1 = new RunnerManager();
		SwimmingManager s1 = new SwimmingManager();
		Person p1 = new Person();
		Dog d1 = new Dog();

		r1.cmd(d1);
		s1.sw(d1);
		r1.cmd(p1);
		s1.sw(p1);

	}

}
