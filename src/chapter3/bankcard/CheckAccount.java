package chapter3.bankcard;

public class CheckAccount extends Account {

	public CheckAccount() {
		super();

	}

	private double overdraft;//����������-���

	//��������
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
	// ȡǮ
	public double withdraw(double amcount3) {
		if (balance >= amcount3) {
			this.balance = balance - amcount3;
			System.out.println("��ȡ������Ϊ:" + balance + "," + "��͸֧��Ϊ:" + overdraft);
		} else {
			if (amcount3 <=balance + overdraft) {				
				overdraft =balance+overdraft -amcount3;
				balance=0;
				System.out.println("��ȡ�������Ϊ:" +balance+ "," + "��͸֧��Ϊ:" + overdraft);
			} else {
				System.out.println("������͸֧���");				
			}
		}
		return amcount3;
	}
}