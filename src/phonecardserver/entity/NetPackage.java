package phonecardserver.entity;

import phonecardserver.services.NetService;

public class NetPackage extends ServicePackage implements NetService {
	
	private int talkTime=0;
	private int smsCount=0;
	private int flow=3072;
	
	public NetPackage() {
		super();
		super.price=68;
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
		 System.out.println("2.网虫套餐：\n通话时长为：" + this.talkTime + "分钟\t短信条数："
	                + this.smsCount + "条\t上网流量:" + flow+"MB");
	    }
	

	@Override
	public String toString() {
		return "网虫套餐";
	}


	@Override
	public int netPlay(int flow, phonecardserver.entity.MobileCard mc) {
		 int temp=flow;
	        for(int i=1;i<flow;i++){
	            if(this.flow-mc.getRealFlow()>=1){
	                mc.setRealFlow(mc.getRealFlow()+1);
	            }else if(mc.getMoney()>=0.1){
	                mc.setRealFlow(mc.getRealFlow()+1);
	                mc.setMoney(mc.getMoney());
	                mc.setConsumAmount(mc.getConsumAmount()+0.1);
	            }else{
	                temp=i;
	                try {
						throw new Exception("本次已经上网"+i+"MB，您的余额不足，请充值后再使用");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        }
	        return temp;
	}

}
