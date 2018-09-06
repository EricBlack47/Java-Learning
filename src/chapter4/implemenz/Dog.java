package chapter4.implemenz;

public class Dog implements Runner, Swimminger {
	
	private String eat;
	

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	@Override
	public void run() {
		System.out.println("on four legs");

	}

	@Override
	public void swim() {
		System.out.println("π∑≈Ÿ Ω”Œ”æ");

	}

}
