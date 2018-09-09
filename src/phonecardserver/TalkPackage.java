package phonecardserver;

import phonecardserver.services.CallService;
import phonecardserver.services.SendService;

public class TalkPackage extends ServicePackage implements CallService,SendService{
	
	private int talkTime;
	private int smsCount;

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

	

	@Override
	public String toString() {
		return "»°ðìÌ×²Í";
	}

	@Override
	public void call(int talkTimeMin,MobileCard mc) {
		
		
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
	}

	@Override
	public void send(int count, MobileCard mc) {
		// TODO Auto-generated method stub
		
	}
	
	

}
