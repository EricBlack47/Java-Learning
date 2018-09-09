package phonecardserver;

import phonecardserver.services.CallService;
import phonecardserver.services.NetService;
import phonecardserver.services.SendService;

public class SuperPackage extends ServicePackage implements CallService,SendService,NetService{
	
	private int talkTime;
	private int smsCount;
	private int flow;
	
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
		super.showInfo();
	}

	

	@Override
	public String toString() {
		return "Œ“ «≥¨»ÀÃ◊≤Õ";
	}

	@Override
	public void send(int count, MobileCard mc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call(int talkTimeMin, MobileCard mc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void netPlay(int flow, MobileCard mc) {
		// TODO Auto-generated method stub
		
	}

}
