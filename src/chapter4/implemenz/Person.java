package chapter4.implemenz;

public class Person implements Runner, Swimminger {

	private String sleep;
	

	public String getSleep() {
		return sleep;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	@Override
	public void run() {
		System.out.println("on two legs");

	}

	@Override
	public void swim() {
		System.out.println("втсис╬");

	}

}
