package phonecardserver.utils;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import phonecardserver.entity.ConsumInfo;
import phonecardserver.entity.MobileCard;

public class CardUtil {
	static MobileCard mc;
	static Scanner sc=new Scanner(System.in);
	public static Map<String,MobileCard> cards;//创建卡号集合，用来存储完成创建的卡
	public static Map<String, List<ConsumInfo>> consumInfos;//创建消费记录集合，存放所有卡消费记录
	
	//初始化场景
	public static void initScene() { 
		
	}
	
	//查找卡号是否存在
	public static boolean isExistCard(String number,String passWord) {
		mc=cards.get(number);
		if(mc!=null&&mc.getPassWord().equals(passWord)) return true;
		return true;
		
	} 

	
	//生成随机卡号
		public static String creatNumber() {
			
			return null;		
		}
		
	//获取随机号码组
		public static String[] getNewNumbers() {
			return null;
		}
	
			
	//向卡集合添加新卡
	public static void addCard(MobileCard m) {
		cards.put(mc.getCardNumber(),m);
	}
	
	//注销卡号，从集合中移除
	public static void delCard(String number) {
		
	}
	
	//显示卡号套餐余额
	public static void showRemainDetail(String num) {
		
	}
	
	//显示账单
	public static void showAmountDetail(String num) {
		mc=cards.get(num);
		System.out.println("卡号:"+num);
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
