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
	public static Map<String,MobileCard> cards;//�������ż��ϣ������洢��ɴ����Ŀ�
	public static Map<String, List<ConsumInfo>> consumInfos;//�������Ѽ�¼���ϣ�������п����Ѽ�¼
	
	
	//��ʼ������
	public static void initScene() {
		Scence s1=new Scence(Scence.CALL,520,"�˿�����Ѳ�!");
		Scence s2=new Scence(Scence.SMS,500,"����һ��������!");
		Scence s3=new Scence(Scence.NET,5000,"����һ�죬����һ�Ѽ�!");
		Scence s4=new Scence(Scence.CALL,600,"�������!");
		Scence s5=new Scence(Scence.SMS,300,"��10086�ͷ����ź�ը!");
		Scence s6=new Scence(Scence.NET,10000,"���Ǵ�300����!");
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
				System.out.println("�ÿ���֧�ִ�绰ҵ��");
			break;
		case Scence.NET:
			if(sp instanceof NetService) {
				NetService ns=(NetService) sp;
				ns.netPlay(scence.getData(), mc);
			}else
				System.out.println("�ÿ���֧������ҵ��");
			break;
		case Scence.SMS:
			if(sp instanceof SendService) {
				SendService ss=(SendService) sp;
				ss.send(scence.getData(), mc);
			}else {
				System.out.println("�ÿ���֧�ַ��Ͷ���ҵ��");
			}
			break;
		}
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
		System.out.println("-----------�ײ�����-------------");
		System.out.println("���Ŀ����ǣ�"+num+",�ײ����");
		ServicePackage sp=mc.getServicePackage();
		if(sp instanceof TalkPackage) {//�����ײ�
			TalkPackage tp =(TalkPackage) sp;
			int a=tp.getTalkTime()-mc.getRealTalkTime();
			a=a>0?a:0;
			System.out.println("ͨ��ʱ��:"+a);
			int b=tp.getSmsCount()-mc.getRealSMSCount();
			b=b>0?b:0;
			System.out.println("��������:"+b);
		}
		else if(sp instanceof NetPackage) {//�����ײ�
			NetPackage np=(NetPackage) sp;
			long f=np.getFlow()-mc.getRealFlow();
			f=f>0?f:0;
			System.out.println("����:"+f);
		}
		else if(sp instanceof SuperPackage) {//�����ײ�
			SuperPackage sup=(SuperPackage) sp;
			int a=sup.getTalkTime()-mc.getRealTalkTime();
			a=a>0?a:0;
			System.out.println("ͨ��ʱ��:"+a);
			int b=sup.getSmsCount()-mc.getRealSMSCount();
			b=b>0?b:0;
			System.out.println("��������:"+b);
			long f=sup.getFlow()-mc.getRealFlow();
			f=f>0?f:0;
			System.out.println("����:"+f);
		}
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
