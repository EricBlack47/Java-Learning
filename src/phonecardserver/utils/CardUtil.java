package phonecardserver.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import phonecardserver.entity.ConsumInfo;
import phonecardserver.entity.MobileCard;
import phonecardserver.entity.NetPackage;
import phonecardserver.entity.Scence;
import phonecardserver.entity.ServicePackage;
import phonecardserver.entity.SuperPackage;
import phonecardserver.entity.TalkPackage;
import phonecardserver.services.CallService;
import phonecardserver.services.NetService;
import phonecardserver.services.SendService;

public class CardUtil {
	static MobileCard mc;
	static Scanner sc=new Scanner(System.in);
	public static List<Scence> scences=new ArrayList<>();
	public static Map<String,MobileCard> cards;//创建卡号集合，用来存储完成创建的卡
	public static Map<String, List<ConsumInfo>> consumInfos;//创建消费记录集合，存放所有卡消费记录
	
	
	//初始化场景
	public static void initScene() {
		Scence s1=new Scence(Scence.CALL,520,"顾客如此难缠!");
		Scence s2=new Scence(Scence.SMS,500,"发了一万条短信!");
		Scence s3=new Scence(Scence.NET,5000,"打了一天，吃了一把鸡!");
		Scence s4=new Scence(Scence.CALL,600,"找人唠嗑!");
		Scence s5=new Scence(Scence.SMS,300,"被10086客服短信轰炸!");
		Scence s6=new Scence(Scence.NET,10000,"还是打300好了!");
		scences.add(s1);
		scences.add(s2);
		scences.add(s3);
		scences.add(s4);
		scences.add(s5);
		scences.add(s6);
	}
	
	
	public static void useCard(String num) {
		mc=cards.get(num);
		Random random=new Random();
		int i = random.nextInt(5);
		Scence scence=scences.get(i);		
		ServicePackage sp=mc.getServicePackage();
		switch(scence.getType()) {
		case Scence.CALL:
			if(sp instanceof CallService) {
				CallService cs=(CallService) sp;
				cs.call(scence.getData(), mc);
			}else
				System.out.println("该卡不支持打电话业务！");
			break;
		case Scence.NET:
			if(sp instanceof NetService) {
				NetService ns=(NetService) sp;
				ns.netPlay(scence.getData(), mc);
			}else
				System.out.println("该卡不支持上网业务！");
			break;
		case Scence.SMS:
			if(sp instanceof SendService) {
				SendService ss=(SendService) sp;
				ss.send(scence.getData(), mc);
			}else {
				System.out.println("该卡不支持发送短信业务！");
			}
			break;
		}
	}
	
	
	//查找卡号是否存在
	public static boolean isExistCard(String number,String passWord) {
		mc=cards.get(number);
		if(mc!=null&&mc.getPassWord().equals(passWord)) return true;
		return true;
		
	} 

	
	//生成随机卡号
		public static String creatNumber() {
			StringBuffer num=new StringBuffer("139");
			Random random=new Random();
			for(int i=0;i<8;i++) {
				num.append(random.nextInt(10));
			}
			return num.toString();		
		}
		
	//获取随机号码组
		public static String[] getNewNumbers(int count) {
			String[] number=new String[count];
			for(int i=0;i<count;i++) {
				number[i] = creatNumber();
			}
			return number;
		}
	
			
	//向卡集合添加新卡
	public static void addCard(MobileCard m) {
		cards.put(mc.getCardNumber(),m);
	}
	
	//注销卡号，从集合中移除
	public static void delCard(String number) {
		cards.remove(mc.getCardNumber());
	}
	
	//显示卡号套餐余额
	public static void showRemainDetail(String num) {
		mc=cards.get(num);
		System.out.println("-----------套餐余量-------------");
		System.out.println("您的卡号是："+num+",套餐余额");
		ServicePackage sp=mc.getServicePackage();
		if(sp instanceof TalkPackage) {//话痨套餐
			TalkPackage tp =(TalkPackage) sp;
			int a=tp.getTalkTime()-mc.getRealTalkTime();
			a=a>0?a:0;
			System.out.println("通话时长:"+a);
			int b=tp.getSmsCount()-mc.getRealSMSCount();
			b=b>0?b:0;
			System.out.println("短信条数:"+b);
		}
		else if(sp instanceof NetPackage) {//网虫套餐
			NetPackage np=(NetPackage) sp;
			long f=np.getFlow()-mc.getRealFlow();
			f=f>0?f:0;
			System.out.println("流量:"+f);
		}
		else if(sp instanceof SuperPackage) {//超人套餐
			SuperPackage sup=(SuperPackage) sp;
			int a=sup.getTalkTime()-mc.getRealTalkTime();
			a=a>0?a:0;
			System.out.println("通话时长:"+a);
			int b=sup.getSmsCount()-mc.getRealSMSCount();
			b=b>0?b:0;
			System.out.println("短信条数:"+b);
			long f=sup.getFlow()-mc.getRealFlow();
			f=f>0?f:0;
			System.out.println("流量:"+f);
		}
	}
	
	//显示账单
	public static void showAmountDetail(String nums) {
		mc=cards.get(nums);
		System.out.println("卡号:"+nums);
		System.out.println("套餐资费:"+mc.getServicePackage().price);
		System.out.println("合计:"+mc.getConsumAmount());
		System.out.println("账户余额:"+mc.getMoney());
	}
	
	//添加消费记录
	public static void addConsumInfo(String number,ConsumInfo info) {
		
	}
	
	//更换套餐
	public static void changePack(String num,Scanner s) {
		
	}
	
	//充钱
	public static int chargeMoney(String num,double strMoney) {
		cards.get(num).setMoney(cards.get(num).getMoney()+strMoney);
		return (int) cards.get(num).getMoney();
	}
}
