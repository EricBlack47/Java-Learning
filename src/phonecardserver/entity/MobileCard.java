package phonecardserver.entity;

public class MobileCard {
	private String cardNumber;
	private String userName;
	private String passWord;
	private ServicePackage servicePackage;
	private double consumAmount;
	private double money;
	private int realTalkTime;
	private int realSMSCount;
	private int realFlow;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public ServicePackage getServicePackage() {
		return servicePackage;
	}

	public void setServicePackage(ServicePackage servicePackage) {
		this.servicePackage = servicePackage;
	}

	public double getConsumAmount() {
		return consumAmount;
	}

	public void setConsumAmount(double consumAmount) {
		this.consumAmount = consumAmount;
	}

	public double getMoney() {
		return money;
	}

	public double setMoney(double money) {
		return this.money = money;
	}

	public int getRealTalkTime() {
		return realTalkTime;
	}

	public void setRealTalkTime(int realTalkTime) {
		this.realTalkTime = realTalkTime;
	}

	public int getRealSMSCount() {
		return realSMSCount;
	}

	public void setRealSMSCount(int realSMSCount) {
		this.realSMSCount = realSMSCount;
	}

	public int getRealFlow() {
		return realFlow;
	}

	public void setRealFlow(int realFlow) {
		this.realFlow = realFlow;
	}

	@Override
	public String toString() {
		return "MoblieCard [∫≈¬Î=" + cardNumber + ", –’√˚=" + userName + ", √‹¬Î=" + passWord
				+ ", Ã◊≤Õ¿‡–Õ=" + servicePackage + ", ª∞∑—”‡∂Ó =" + money +"]";
	}

}
