package phonecardserver;

import phonecardserver.services.NetService;

public class NetPackage extends ServicePackage implements NetService {
	
	private int flow;
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
	}

	public int getFlow() {
		return flow;
	}


	public void setFlow(int flow) {
		this.flow = flow;
	}


	@Override
	public void netPlay() {
		// TODO Auto-generated method stub
		
	}

}
