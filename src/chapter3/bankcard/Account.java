package chapter3.bankcard;

public class Account {

	private int id;// 账号
	protected double balance;// 余额
	private double annualIterestRate;// 年利率
	
	public Account() {		
	}
		
	public Account(int id, double balance, double annualIterestRate) {
		this.id=id;
		this.balance=balance;
		this.annualIterestRate=annualIterestRate;
	}

	public double withdraw(double amcount) {
		if (balance > amcount) {
			this.balance=balance-amcount;
			System.out.println("您取款后余额为:" +balance );
			}
		else
			System.out.println("no");
		return amcount;
	}

	public double deposit(double amcount2) {
		
		this.balance=balance+amcount2;		
		System.out.println("您存款后余额为:" + balance);
		System.out.println("您的月利率为:" + (balance * 0.045) / 12);
		return amcount2;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualIterestRate() {
		return annualIterestRate;
	}

	public void setAnnualIterestRate(double annualIterestRate) {
		this.annualIterestRate = annualIterestRate;
	}

	
}
