package phonecardserver.utils;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import phonecardserver.entity.ConsumInfo;
import phonecardserver.entity.MobileCard;

public class CardUtil {
	static MobileCard mc;
	static Scanner sc=new Scanner(System.in);
	public static Map<String,MobileCard> cards;//�������ż��ϣ������洢��ɴ����Ŀ�
	public static Map<String, List<ConsumInfo>> consumInfos;//�������Ѽ�¼���ϣ�������п����Ѽ�¼
	
	//��ʼ������
	public static void initScene() { 
		
	}
	
	//���ҿ����Ƿ����
	public static boolean isExistCard(String number,String passWord) {
		mc=cards.get(number);
		if(mc!=null&&mc.getPassWord().equals(passWord)) return true;
		return true;
		
	} 

	
	//�����������
		public static String creatNumber() {
			
			return null;		
		}
		
	//��ȡ���������
		public static String[] getNewNumbers() {
			return null;
		}
	
			
	//�򿨼�������¿�
	public static void addCard(MobileCard m) {
		cards.put(mc.getCardNumber(),m);
	}
	
	//ע�����ţ��Ӽ������Ƴ�
	public static void delCard(String number) {
		
	}
	
	//��ʾ�����ײ����
	public static void showRemainDetail(String num) {
		
	}
	
	//��ʾ�˵�
	public static void showAmountDetail(String num) {
		mc=cards.get(num);
		System.out.println("����:"+num);
		System.out.println("�ײ��ʷ�:"+mc.getServicePackage().price);
		System.out.println("�ϼ�:"+mc.getConsumAmount());
		System.out.println("�˻����:"+mc.getMoney());
	}
	
	//������Ѽ�¼
	public static void addConsumInfo(String number,ConsumInfo info) {
		
	}
	
	//�����ײ�
	public static void changePack(String num,Scanner s) {
		
	}
	
	//��Ǯ
	public static int chargeMoney(String num,double strMoney) {
		cards.get(num).setMoney(cards.get(num).getMoney()+strMoney);
		return (int) cards.get(num).getMoney();
	}
}
