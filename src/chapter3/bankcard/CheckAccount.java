package chapter3.bankcard;

public class CheckAccount extends Account {

	public CheckAccount() {
		super();

	}

	private double overdraft;//建立新属性-余额

	//设置余额方法
	public CheckAccount(int id, double balance, double annualIterestRate, double overdraft) {
		super(id, balance, annualIterestRate);
		this.setOverdraft(overdraft);
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	// 取钱
	public double withdraw(double amcount3) {
		if (balance >= amcount3) {
			this.balance = balance - amcount3;
			System.out.println("您取款后余额为:" + balance + "," + "可透支额为:" + overdraft);
		} else {
			if (amcount3 <=balance + overdraft) {				
				overdraft =balance+overdraft -amcount3;
				balance=0;
				System.out.println("您取款后的余额为:" +balance+ "," + "可透支额为:" + overdraft);
			} else {
				System.out.println("超出可透支额度");				
			}
		}
		return amcount3;
	}
}