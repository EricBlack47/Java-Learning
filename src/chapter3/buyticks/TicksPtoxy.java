package chapter3.buyticks;

public class TicksPtoxy implements Buy {

	private Buy customer;

	public void setCustomer(Buy customer) {
		this.customer = customer;
	}

	@Override
	public void buyticks() {
		try {
			System.out.println("please wait...");
			Thread.sleep(1000);
			customer.buyticks();
			System.out.println("enjoy your trip!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}