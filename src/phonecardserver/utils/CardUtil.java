package phonecardserver.utils;

import java.util.List;
import java.util.Map;
import java.util.Random;
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
			StringBuffer num=new StringBuffer("139");
			Random random=new Random();
			for(int i=0;i<8;i++) {
				num.append(random.nextInt(10));
			}
			return num.toString();		
		}
		
	//��ȡ���������
		public static String[] getNewNumbers(int count) {
			String[] number=new String[count];
			for(int i=0;i<count;i++) {
				number[i] = creatNumber();
			}
			return number;
		}
	
			
	//�򿨼�������¿�
	public static void addCard(MobileCard m) {
		cards.put(mc.getCardNumber(),m);
	}
	
	//ע�����ţ��Ӽ������Ƴ�
	public static void delCard(String number) {
		cards.remove(mc.getCardNumber());
	}
	
	//��ʾ�����ײ����
	public static void showRemainDetail(String num) {
		mc=cards.get(num);
		System.out.println("�ײ�ͨ��ʣ��:"+mc.getRealTalkTime());
		System.out.println("�ײͶ���ʣ��:"+mc.getRealSMSCount());
		System.out.println("�ײ�����ʣ��:"+mc.getRealFlow());
	}
	
	//��ʾ�˵�
	public static void showAmountDetail(String nums) {
		mc=cards.get(nums);
		System.out.println("����:"+nums);
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
