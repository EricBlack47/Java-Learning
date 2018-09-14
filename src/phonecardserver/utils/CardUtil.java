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
	public static Map<String,MobileCard> cards;//�������ż��ϣ������洢��ɴ����Ŀ�
	public static Map<String, List<ConsumInfo>> consumInfos;//�������Ѽ�¼���ϣ�������п����Ѽ�¼
	
	
	//��ʼ������
	public static void initScene() {
		Scence s1=new Scence(Scence.CALL,100,"��绰���˿�����Ѳ�!");
		Scence s2=new Scence(Scence.SMS,50,"����һ�����!");
		Scence s3=new Scence(Scence.NET,500,"����������һ�Ѽ�!");
		Scence s4=new Scence(Scence.CALL,60,"��绰�������!");
		Scence s5=new Scence(Scence.SMS,30,"��10086�ͷ����ź�ը!");
		Scence s6=new Scence(Scence.NET,300,"�������Ǵ�300����!");
		scences.add(s1);
		scences.add(s2);
		scences.add(s3);
		scences.add(s4);
		scences.add(s5);
		scences.add(s6);
	}
	
	//ģ��ʹ�ÿ�
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
		System.out.println("������"+scence);
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
		mc=cards.get(m);
		cards.put(mc.getCardNumber(),m);
	}
	
	//ע�����ţ��Ӽ������Ƴ�
	public static void delCard(String num) {
		mc=cards.get(num);
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
		DecimalFormat df=new DecimalFormat("0.0");
		double sumAmount=(mc.getConsumAmount()+mc.getServicePackage().price);
		System.out.println("����:"+nums);
		System.out.println("�ײ��ʷ�:"+mc.getServicePackage().price);
		System.out.println("�ϼ�:"+df.format(sumAmount));
		System.out.println("���:"+df.format(mc.getMoney()));
	}
	
	//������Ѽ�¼
	public static void addConsumInfo(String nums,ConsumInfo info) {
		mc=cards.get(nums);
		System.out.println("-----------�����嵥-----------");
	    System.out.println("��ʹ��ͨ��ʱ�䣺"+mc.getRealTalkTime());
	    System.out.println("��ʹ�ö�������"+mc.getRealSMSCount());
		System.out.println("��ʹ��������"+mc.getRealFlow());
	}
	
	//��ӡ�����嵥
	public static void printConsunmInfo(String num,ConsumInfo info) throws IOException {
		File file=new File("e:\\�����嵥.txt");
		PrintStream out=new PrintStream(new FileOutputStream(file));
		out.println("--------------�����嵥----------------");
		out.println("���ţ�"+mc.getCardNumber());
		out.println("ͨ��ʱ�䣺"+mc.getRealTalkTime());
		out.println("���ţ�"+mc.getRealSMSCount());
		out.println("������"+mc.getRealFlow());
		out.close();
	}
	
	//�����ײ�
	public static void changePack(String num,Scanner s) {
		mc=cards.get(num);
		System.out.println("��ѡ������ײ�����:");	
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
	
	//��Ǯ
	public static int chargeMoney(String num,double strMoney) {
		cards.get(num).setMoney(cards.get(num).getMoney()+strMoney);
		return (int) cards.get(num).getMoney();
	}
	
	//��ʾ�ʷ�˵��
	public static void readPackage() throws FileNotFoundException {
		FileInputStream in=new FileInputStream("E:\\�ʷ�˵��.txt");
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
