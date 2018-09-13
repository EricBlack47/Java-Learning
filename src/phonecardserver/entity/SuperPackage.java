package phonecardserver.entity;

import java.math.BigDecimal;

import phonecardserver.services.CallService;
import phonecardserver.services.NetService;
import phonecardserver.services.SendService;

public class SuperPackage extends ServicePackage implements CallService, SendService, NetService {

	private int talkTime = 200;
	private int smsCount = 50;
	private int flow = 1024;

	public SuperPackage() {
		super();
		super.price = 78;
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
		System.out.println("3.�����ײͣ�\nͨ��ʱ��Ϊ��" + this.talkTime + "����\t����������" + this.smsCount + "��\t��������:" + flow + "MB");
	}

	@Override
	public String toString() {
		return "�����ײ�";
	}

	@Override
	// ����
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

	@Override
	// ����
	public int send(int count, MobileCard mc) {
		int temp = count;
		for (int i = 0; i < smsCount; i++) {
			if (this.smsCount - mc.getRealSMSCount() >= 1) {
				mc.setRealSMSCount(mc.getRealSMSCount() + 1);
			} else {
				if (mc.getMoney() >= 0.1) {
					mc.setRealSMSCount(mc.getRealSMSCount() + 1);
					mc.setMoney(mc.getMoney()-0.1);
					mc.setConsumAmount(mc.getConsumAmount() + 0.1);
				} else {
					temp=i;
					System.out.println("���ζ������ó�"+i+"�����������㣬���ֵ����ʹ��");
					return i;
				}
			}
		}
		return temp;
	}

	@Override
	// ͨ��
	public int call(int talkTimeMin, MobileCard mc) {
		int temp = talkTimeMin;
		for (int i = 0; i < talkTimeMin; i++) {
			if (this.talkTime - mc.getRealTalkTime() >= 1) {
				mc.setRealTalkTime(mc.getRealTalkTime() + 1);
			} else {
				if (mc.getMoney() >= 0.2) {
					mc.setRealTalkTime(mc.getRealTalkTime() + 1);
					mc.setMoney(mc.getMoney()-0.2);
					mc.setConsumAmount(mc.getConsumAmount() + 0.2);
				} else {
					temp=i;
					System.out.println("����ͨ�����ó�"+i+"���ӣ��������㣬���ֵ����ʹ��");
					return i;
				}
			}
		}
		return temp;
	}
}
