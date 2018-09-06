package chapter3.bankcard;

public class AccountTest{
	
	public static void main(String[] args) {
		
		Account a1=new Account(1122,20000,(20000*0.045));
		a1.withdraw(2500);
		a1.deposit(3000);	
		CheckAccount a2=new CheckAccount(1122,20000,(20000*0.045),5000);
		a2.withdraw(5000);
		a2.withdraw(18000);
		a2.withdraw(3000);
	}
	    
	
	

}
