package phonecardserver;

public class ConsumInfo {

	private String cardNumber;//����
	private String type;//��������
	private String consumData;//��������
	public static final int talk=1;//����1ͨ��
	public static final int sms=2;//����2����
	public static final int net=3;//����3����

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getConsumData() {
		return consumData;
	}

	public void setConsumData(String consumData) {
		this.consumData = consumData;
	}

	@Override
	public String toString() {
		return "ConsumInfo [cardNumber=" + cardNumber + ", type=" + type + ", consumData=" + consumData + "]";
	}

}
