package phonecardserver.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;
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
		Scence s1=new Scence(Scence.CALL,100,"打电话！顾客如此难缠!");
		Scence s2=new Scence(Scence.SMS,50,"发了一天短信!");
		Scence s3=new Scence(Scence.NET,500,"上网，吃了一把鸡!");
		Scence s4=new Scence(Scence.CALL,60,"打电话找人唠嗑!");
		Scence s5=new Scence(Scence.SMS,30,"被10086客服短信轰炸!");
		Scence s6=new Scence(Scence.NET,300,"上网还是打300好了!");
		scences.add(s1);
		scences.add(s2);
		scences.add(s3);
		scences.add(s4);
		scences.add(s5);
		scences.add(s6);
	}
	
	//模拟使用卡
	public static void useCard(String num) {
		mc=cards.get(num);
		Random random=new Random();
		int i = random.nextInt(6);
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
		System.out.println("场景："+scence);
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
		mc=cards.get(m);
		cards.put(mc.getCardNumber(),m);
	}
	
	//注销卡号，从集合中移除
	public static void delCard(String num) {
		mc=cards.get(num);
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
		DecimalFormat df=new DecimalFormat("0.0");
		double sumAmount=(mc.getConsumAmount()+mc.getServicePackage().price);
		System.out.println("卡号:"+nums);
		System.out.println("套餐资费:"+mc.getServicePackage().price);
		System.out.println("合计:"+df.format(sumAmount));
		System.out.println("余额:"+df.format(mc.getMoney()));
	}
	
	//添加消费记录
	public static void addConsumInfo(String nums,ConsumInfo info) {
		mc=cards.get(nums);
		System.out.println("-----------消费清单-----------");
	    System.out.println("已使用通话时间："+mc.getRealTalkTime());
	    System.out.println("已使用短信数："+mc.getRealSMSCount());
		System.out.println("已使用流量："+mc.getRealFlow());
	}
	
	//打印消费清单
	public static void printConsunmInfo(String num,ConsumInfo info) throws IOException {
		File file=new File("e:\\消费清单.txt");
		PrintStream out=new PrintStream(new FileOutputStream(file));
		out.println("--------------消费清单----------------");
		out.println("卡号："+mc.getCardNumber());
		out.println("通话时间："+mc.getRealTalkTime());
		out.println("短信："+mc.getRealSMSCount());
		out.println("流量："+mc.getRealFlow());
		out.close();
	}
	
	//更换套餐
	public static void changePack(String num,Scanner s) {
		mc=cards.get(num);
		System.out.println("请选择更换套餐类型:");	
		int selectPackage = sc.nextInt();
		if (selectPackage == 1)
			mc.setServicePackage(new TalkPackage());
		if (selectPackage == 2)
			mc.setServicePackage(new NetPackage());
		if (selectPackage == 3)
			mc.setServicePackage(new SuperPackage());
		mc.setServicePackage(mc.getServicePackage());
		return;
	}
	
	//充钱
	public static int chargeMoney(String num,double strMoney) {
		cards.get(num).setMoney(cards.get(num).getMoney()+strMoney);
		return (int) cards.get(num).getMoney();
	}
	
	//显示资费说明
	public static void readPackage() throws FileNotFoundException {
		FileInputStream in=new FileInputStream("E:\\资费说明.txt");
		byte[] date=new byte[1024];
		try {
			in.read(date);
			System.out.println(new String(date));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
