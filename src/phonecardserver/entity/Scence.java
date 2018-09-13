package phonecardserver.entity;

public class Scence {
	
	public static final int CALL=1;
	public static final int SMS=2;
	public static final int NET=3;

	private int type;
	private int data;
	private String description;

	public Scence() {

	}

	public Scence(int type, int data, String description) {
		this.type = type;
		this.data = data;
		this.description = description;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Scene [ 使用数据=" + data + ", 场景描述=" + description + "]";
	}

}
