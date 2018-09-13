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
		return "话痨套餐";
	}

	@Override
	public void showInfo() {
		System.out.println("1.话痨套餐：\n通话时长为：" + this.talkTime + "分钟\t短信条数：" + this.smsCount + "条\t上网流量:" + flow + "MB");
	}

	@Override
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
					System.out.println("本次短信已用超"+i+"条，您的余额不足，请充值后在使用");
					return i;
				}
			}
		}
		return temp;
	}

	@Override
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
					System.out.println("本次通话已用超"+i+"分钟，您的余额不足，请充值后在使用");
					return i;
				}
			}
		}
		return temp;
	}
}
