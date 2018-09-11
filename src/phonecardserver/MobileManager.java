package phonecardserver;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import phonecardserver.entity.MobileCard;
import phonecardserver.entity.NetPackage;
import phonecardserver.entity.SuperPackage;
import phonecardserver.entity.TalkPackage;
import phonecardserver.utils.CardUtil;
import phonecardserver.utils.SPConfig;

public class MobileManager {
	static Scanner sc = new Scanner(System.in);
	static MobileCard mc = new MobileCard();
	private static String[] menus = { "1.�û���¼", "2.�û�ע��", "3.ʹ�ÿ�", "4.���ѳ�ֵ", "5.�ʷ�˵��", "6.�˳�ϵͳ" };
	private static String[] menus2 = { "1.�����˵���ѯ", "2.�ײ�������ѯ", "3.��ӡ�����굥", "4.�ײͱ��", "5.��������" };
	private static String[] nums = new String[9];
	private static String[] pack = { "1.�����ײ�", "2.�����ײ�", "3.�����ײ�" };

	public static void main(String[] args) {

		// һ������
		showMenu();
		
		CardUtil.cards = new HashMap<>();
		while (true) {
			System.out.println("��������ѡ���ҵ��:");
			try {
				int select = sc.nextInt();
				switch (select) {
				case 1:
					login();// ��¼
					break;
				case 2:
					registered();// ע��
					// System.out.println("ע��");
					break;
				case 3:
					System.out.println("ʹ��");
					break;
				case 4:
					chargemoney();
					break;
				case 5:
					showPackage();
					break;
				case 6:
					System.out.println("�ټ�");
					return;
				default:
					System.out.println("��������");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("��������");
			}
			showMenu();
		}
	}

	

	// �����˵�
		private static void menu2(String num) {
			showMenu2();
			while (true) {
				System.out.println("��������ѡ���ҵ��:");
				try {
					int select = sc.nextInt();
					switch (select) {
					case 1:
						// �����˵���ѯ
						System.out.println("-----------�˵���ѯ------------");
						CardUtil.showAmountDetail(num);
						break;
					case 2:
						// �ײ�����ѯ
						
						break;
					case 3:
						// ��ӡ���ѵ�
						break;
					case 4:
						// �ײͱ��
						break;
					case 5:
						// ��������
						break;
					}

				} catch (Exception e) {
					sc.nextLine();
					System.out.println("��������");
				}
				showMenu2();
			}

		}
	// ��Ǯ
	private static void chargemoney() {
		System.out.println("�������ֻ����ţ�");
		String phonenum = sc.next();
		System.out.println("�������ֵ��");
		double strMoney = sc.nextInt();
		int sumMoney= CardUtil.chargeMoney(phonenum, strMoney);
		System.out.println("��ֵ�ɹ�����ֵ�����Ϊ��"+sumMoney);
	}

	// ע���˺�
	private static void registered() {
		shownums();
		System.out.println("\r");
		MobileCard mc = new MobileCard();
		System.out.println("��ѡ��һ������:");
		int selectNum = sc.nextInt();
		System.out.println(nums[selectNum - 1]);
		mc.setCardNumber(nums[selectNum - 1]);
		System.out.println("��ѡ���ײ�����:");
		for (String string : pack) {
			System.out.print(string);
		}
		int selectPackage = sc.nextInt();
		if (selectPackage == 1)
			mc.setServicePackage(new TalkPackage());
		if (selectPackage == 2)
			mc.setServicePackage(new NetPackage());
		if (selectPackage == 3)
			mc.setServicePackage(new SuperPackage());
		System.out.println("�����������û���");
		String name = sc.next();
		mc.setUserName(name);
		System.out.println("��������������");
		String pword = sc.next();
		mc.setPassWord(pword);
		System.out.println("��������Ԥ����");
		double putmoney = sc.nextDouble();
		while(putmoney<mc.getServicePackage().price) {
			System.out.println("����Ԥ����֧���ײͣ�����������");
		    putmoney = sc.nextDouble();
		} if(putmoney>=mc.getServicePackage().price) {
			double leftMoney=putmoney-mc.getServicePackage().price;
			System.out.println("��ֵ�ɹ�����ʣ�໰��Ϊ��"+leftMoney);
			mc.setMoney(leftMoney);		
		}			
		System.out.println(mc);
		System.out.println(SPConfig.getConfig(selectPackage));
		CardUtil.cards.put(nums[selectNum - 1], mc);
	}

	// ��¼�˺�
	private static void login() {
		System.out.println("�����������ֻ�����:");
		String num = sc.next();
		System.out.println("��������������:");
		String pw = sc.next();
		String passkey = CardUtil.cards.get(num).getPassWord();
		if (pw.equals(passkey)) {
			System.out.println("��¼�ɹ���");
			showMenu2();
			menu2(num);
		}

	}

	// ��ʾ��������
	private static void showMenu2() {
		System.out.println("----------------��ӭ��¼�û�����----------------");
		for (int i = 0; i < menus2.length; i++) {
			System.out.println(menus2[i]);
		}
	}

	// ��ʾ����
	private static void showMenu() {
		System.out.println("----------------��ӭʹ��Ӫҵ����----------------");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
	}

	// ��ʾ��ѡ����
	private static void shownums() {
		System.out.println("----------------��ӭʹ��Ӫҵ����----------------");
		for (int i = 0; i < 9; i++) {// ѭ���ŴΣ������Ÿ��������
			String number = "139";// ����绰������139��ͷ
			Random random = new Random();
			for (int j = 0; j < 8; j++) {
				nums[i] = number;
				number += random.nextInt(9);
			}
			if (i % 3 == 0)
				System.out.println();
			System.out.print(i + 1 + "." + number + "\t");// ���һ���绰����
		}
	}
	
	//��ʾ�ײ�˵��
	private static void showPackage() {
		NetPackage np=new NetPackage();
		np.showInfo();
		SuperPackage sp=new SuperPackage();
		sp.showInfo();
		TalkPackage tp=new TalkPackage();
		tp.showInfo();
	}
}
