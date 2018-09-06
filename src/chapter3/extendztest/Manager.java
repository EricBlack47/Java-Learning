package chapter3.extendztest;

public class Manager extends Employee {

	public double bonus;

	@Override
	public void work() {
		System.out.println("管理");

	}

	// 构造方法
	public Manager() {
	}

	public Manager(String name, int id, double salary, double bonus) {
		super(name,id,salary);
		this.bonus=bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
}
