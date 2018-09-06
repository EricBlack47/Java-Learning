package chapter3.extendztest;

public class Test {
	public static void main(String[] args) {
		Employee e1=new Manager();
        Employee e2=new CommonEmployee();
        e1.setBonus(20.0);
        e1.setName("Tom");
        e1.setId(110);
        e1.setSalary(100.0);
        System.out.println(e1);
        e1.work();
        e2.work();
	}

}
