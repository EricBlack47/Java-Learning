package phonecardserver.entity;

import phonecardserver.services.CallService;
import phonecardserver.services.SendService;

public class TalkPackage extends ServicePackage implements CallService, SendService {

	private int talkTime = 500;
	private int smsCount = 30;
	private int flow = 0;

	public TalkPackage() {
		super();
		super.price = 58;
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
	public String toString() {
		return "�����ײ�";
	}

	@Override
	public void showInfo() {
		System.out.println("1.�����ײͣ�\nͨ��ʱ��Ϊ��" + this.talkTime + "����\t����������" + this.smsCount + "��\t��������:" + flow + "MB");
	}

	@Override
	public int send(int count, MobileCard mc) {
		int temp = count;
		for (int i = 1; i < count; i++) {
			// �����ٷ�����һ������
			if (this.smsCount - mc.getRealSMSCount() >= 1) {
				mc.setRealSMSCount(mc.getRealSMSCount() + 1);
			} else// �����������ˣ����ǻ��л����ܷ�����
			if (mc.getMoney() >= 0.1) {
				mc.setRealSMSCount(mc.getRealSMSCount() + 1);// ���·��Ͷ�����+1
				mc.setMoney(mc.getMoney() - 0.1);// ���ѷ��Ͷ���
				mc.setConsumAmount(mc.getConsumAmount() + 0.1);// �������ѣ�1
			} else {
				temp = i;// ��¼��������
				try {
					throw new Exception("������ʹ�ö���" + i + "�����������㣬���ֵ����ʹ��");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return temp;
	}

	@Override
	public int call(int talkTimeMin, MobileCard mc) {
		int temp = talkTimeMin;
		for (int i = 1; i < talkTimeMin; i++) {
			if (this.talkTime - mc.getRealTalkTime() >= 1) {
				mc.setRealTalkTime(mc.getRealTalkTime() + 1);
			} else if (mc.getMoney() >= 0.2) {
				mc.setRealTalkTime(mc.getRealTalkTime() + 1);
				mc.setMoney(mc.getMoney());
				mc.setConsumAmount(mc.getConsumAmount() + 0.2);
			} else {
				temp = i;
				try {
					throw new Exception("�����Ѿ�ͨ��" + i + "���ӣ��������㣬���ֵ����ʹ��");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return temp;
	}

}
