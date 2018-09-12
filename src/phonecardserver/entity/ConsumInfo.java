package phonecardserver.entity;

public class ConsumInfo {

	private String cardNumber;//卡号
	private String type;//消费类型
	private String consumData;//消费数据

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
