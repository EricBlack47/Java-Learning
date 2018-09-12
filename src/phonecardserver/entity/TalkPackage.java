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
		for (int i = 1; i < count; i++) {
			// 还能再发至少一条短信
			if (this.smsCount - mc.getRealSMSCount() >= 1) {
				mc.setRealSMSCount(mc.getRealSMSCount() + 1);
			} else// 短信量发完了，但是还有话费能发短信
			if (mc.getMoney() >= 0.1) {
				mc.setRealSMSCount(mc.getRealSMSCount() + 1);// 当月发送短信数+1
				mc.setMoney(mc.getMoney() - 0.1);// 话费发送短信
				mc.setConsumAmount(mc.getConsumAmount() + 0.1);// 当月消费＋1
			} else {
				temp = i;// 记录短信条数
				try {
					throw new Exception("本次已使用短信" + i + "条，您的余额不足，请充值后再使用");
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
					throw new Exception("本次已经通话" + i + "分钟，您的余额不足，请充值后再使用");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return temp;
	}

}
