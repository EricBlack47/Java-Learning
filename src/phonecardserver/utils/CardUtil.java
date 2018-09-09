package phonecardserver.utils;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import phonecardserver.ConsumInfo;
import phonecardserver.MobileCard;

public class CardUtil {
	
	private static Map<String,MobileCard> cards;//创建卡号集合，用来存储完成创建的卡
	private static Map<String, List<ConsumInfo>> consumInfos;//创建消费记录集合，存放所有卡消费记录
	
	//初始化场景
	public static void initScene() { 
		
	}
	
	//查找卡号是否存在
	public static boolean isExistCard(String number,String passWord) {
		cards.get(number);
		cards.get(passWord);
		return true;
		
	} 

	public static boolean isExistCard(String number) {
		return false;
		
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
		
	}
	
	//注销卡号，从集合中移除
	public static void delCard(String number) {
		
	}
	
	//显示卡号套餐余额
	public static void showRemainDetail(String num) {
		
	}
	
	//显示话费余额
	public static void showAmountDetail(String num) {
		
	}
	
	//添加消费记录
	public static void addConsumInfo(String number,ConsumInfo info) {
		
	}
	
	//更换套餐
	public static void changePack(String num,Scanner s) {
		
	}
	
	//充钱
	public static void chargeMoney(String num,double money) {
		num=num;
		money+=money;
	}
	
	
}
