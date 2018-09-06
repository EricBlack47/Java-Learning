package chapter3.bankcard;

public class Account {

	private int id;// �˺�
	protected double balance;// ���
	private double annualIterestRate;// ������
	
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
			System.out.println("��ȡ������Ϊ:" +balance );
			}
		else
			System.out.println("no");
		return amcount;
	}

	public double deposit(double amcount2) {
		
		this.balance=balance+amcount2;		
		System.out.println("���������Ϊ:" + balance);
		System.out.println("����������Ϊ:" + (balance * 0.045) / 12);
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
