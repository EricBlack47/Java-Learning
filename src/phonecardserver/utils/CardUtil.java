package phonecardserver.utils;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import phonecardserver.ConsumInfo;
import phonecardserver.MobileCard;

public class CardUtil {
	
	private static Map<String,MobileCard> cards;//�������ż��ϣ������洢��ɴ����Ŀ�
	private static Map<String, List<ConsumInfo>> consumInfos;//�������Ѽ�¼���ϣ�������п����Ѽ�¼
	
	//��ʼ������
	public static void initScene() { 
		
	}
	
	//���ҿ����Ƿ����
	public static boolean isExistCard(String number,String passWord) {
		cards.get(number);
		cards.get(passWord);
		return true;
		
	} 

	public static boolean isExistCard(String number) {
		return false;
		
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
		
	}
	
	//ע�����ţ��Ӽ������Ƴ�
	public static void delCard(String number) {
		
	}
	
	//��ʾ�����ײ����
	public static void showRemainDetail(String num) {
		
	}
	
	//��ʾ�������
	public static void showAmountDetail(String num) {
		
	}
	
	//������Ѽ�¼
	public static void addConsumInfo(String number,ConsumInfo info) {
		
	}
	
	//�����ײ�
	public static void changePack(String num,Scanner s) {
		
	}
	
	//��Ǯ
	public static void chargeMoney(String num,double money) {
		num=num;
		money+=money;
	}
	
	
}
