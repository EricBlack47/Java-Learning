package chapter12.threadtest;

public class Mantou {
	
	private String name;
	private double price;
	

	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Mantou [name=" + name + ", price=" + price + "Ԫ]";
	}
	

}
