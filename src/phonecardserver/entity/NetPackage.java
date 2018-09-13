package phonecardserver.entity;

import java.math.BigDecimal;

import phonecardserver.services.NetService;

public class NetPackage extends ServicePackage implements NetService {

	private int talkTime = 0;
	private int smsCount = 0;
	private int flow = 3072;

	public NetPackage() {
		super();
		super.price = 68;
	}

	public int getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(int talkTime) {
		this.talkTime = talkTime;
	}

	public int getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

	@Override
	public void showInfo() {
		System.out.println("2.�����ײͣ�\nͨ��ʱ��Ϊ��" + this.talkTime + "����\t����������" + this.smsCount + "��\t��������:" + flow + "MB");
	}

	@Override
	public String toString() {
		return "�����ײ�";
	}

	@Override
	public int netPlay(int flow, MobileCard mc) {
		int temp = flow;
		for (int i = 0; i < flow; i++) {
			if (this.flow - mc.getRealFlow() >= 1) {
				mc.setRealFlow(mc.getRealFlow() + 1);
			} else {
				//�����ײͺ󣬴ӻ��ѿ۳�
				if (mc.getMoney() >= 0.1) {
					BigDecimal bd=new BigDecimal(mc.getMoney()+"");
					bd=bd.subtract(new BigDecimal(0.1+""));
					mc.setRealFlow(mc.getRealFlow() + 1);
					mc.setMoney(bd.doubleValue());
					mc.setConsumAmount(mc.getConsumAmount() + 0.1);
				} else {
					temp=i;
				    System.out.println("��������������"+i+"MB���������㣬���ֵ����ʹ��");
				    return i;
				}
			}
		}
		return temp;
	}

}
