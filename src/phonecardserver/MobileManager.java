package phonecardserver;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import phonecardserver.entity.ConsumInfo;
import phonecardserver.entity.MobileCard;
import phonecardserver.entity.NetPackage;
import phonecardserver.entity.SuperPackage;
import phonecardserver.entity.TalkPackage;
import phonecardserver.utils.CardUtil;

public class MobileManager {
	static Scanner sc = new Scanner(System.in);
	static MobileCard mc = new MobileCard();
	private static String[] menus = { "1.�û���¼", "2.�û�ע��", "3.ʹ�ÿ�", "4.���ѳ�ֵ", "5.�ʷ�˵��", "6.�˳�ϵͳ" };
	private static String[] menus2 = { "1.�����˵���ѯ", "2.�ײ�������ѯ", "3.��ӡ�����굥", "4.�ײͱ��", "5.��������" };
	private static String[] nums = new String[9];
	private static String[] pack = { "1.�����ײ�", "2.�����ײ�", "3.�����ײ�" };

	public static void main(String[] args) {
		CardUtil.initScene();
		showMenu();
		CardUtil.cards = new HashMap<>();
		while (true) {
			System.out.println("\r"+"��������ѡ���ҵ��:");
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
					// ʹ�ÿ�
					System.out.println("�����뿨�ţ�");
					String number = sc.next();
					CardUtil.useCard(number);
					break;
				case 4:
					chargemoney();
					break;
				case 5:
					CardUtil.readPackage();
					//showPackage();
					break;
				case 6:
					System.out.println("�ټ�");
					return;
				default:
					System.out.println("��������");
				}
			} catch (Exception e) {
				sc.nextLine();
				e.printStackTrace();
				System.out.println("��������");
			}
			showMenu();
		}
	}

	// �����˵�
	private static void menu2(String num) {
		showMenu2();
		while (true) {
			System.out.println("\r"+"�����루1~5��ѡ���ҵ��:");
			System.out.println("�����������ַ����ϼ��˵���");
			try {
				int select = sc.nextInt();
				switch (select) {
				case 1:
					// �����˵���ѯ
					System.out.println("----------------�˵���ѯ----------------");
					CardUtil.showAmountDetail(num);
					break;
				case 2:
					// �ײ�����ѯ
					CardUtil.showRemainDetail(num);
					break;
				case 3:
					// ��ӡ���ѵ�
					CardUtil.addConsumInfo(num, (ConsumInfo) CardUtil.consumInfos);
					CardUtil.printConsunmInfo(num, (ConsumInfo) CardUtil.consumInfos);
					break;
				case 4:
					// �ײͱ��
					showPackage();
					CardUtil.changePack(num, sc);
					System.out.println("�ɹ������ײ�!��"+CardUtil.cards.get(num));
					break;
				case 5:
					CardUtil.delCard(num);
					System.out.println("���Ѿ��ɹ�����");
					// ��������
					break;
				case 6:
					return;
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
		int sumMoney = CardUtil.chargeMoney(phonenum, strMoney);
		System.out.println("��ֵ�ɹ�����ֵ�����Ϊ��" + sumMoney);
	}

	// ע���˺�
	private static void registered() {
		shownums();
		System.out.println("\r");	
		MobileCard mc = new MobileCard();
		System.out.println("��ѡ��һ������:");
		int selectNum = sc.nextInt();
		System.out.println(nums[selectNum-1]);
		mc.setCardNumber(nums[selectNum-1]);
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
		while (putmoney < mc.getServicePackage().price) {
			System.out.println("����Ԥ����֧���ײͣ�����������");
			putmoney = sc.nextDouble();
		}
		if (putmoney >= mc.getServicePackage().price) {
			double leftMoney = putmoney - mc.getServicePackage().price;
			System.out.println("��ֵ�ɹ�����ʣ�໰��Ϊ��" + leftMoney);
			mc.setMoney(leftMoney);
		}
		System.out.println(mc);
		mc.getServicePackage().showInfo();
		//System.out.println(SPConfig.getConfig(selectPackage));
		CardUtil.cards.put(nums[selectNum - 1], mc);
	}

	// ��¼�˺�
	private static void login() {
		try {
			System.out.println("�����������ֻ�����:");
			String num = sc.next();
			System.out.println("��������������:");
			String pw = sc.next();
			String passkey = CardUtil.cards.get(num).getPassWord();
			if (pw.equals(passkey)) {
				System.out.println("��¼�ɹ���");
				menu2(num);
			}else {
				System.out.println("��¼ʧ�ܣ�");
			}
		} catch (Exception e) {
			System.out.println("�˺Ų����ڣ�");
		}

	}

	// ��ʾ��������
	private static void showMenu2() {
		System.out.println("----------------��ӭ��¼�û�����----------------");
		for (int i = 0; i < menus2.length; i++) {
			System.out.print(menus2[i]+"\t");
		}
	}

	// ��ʾ����
	private static void showMenu() {
		System.out.println("----------------��ӭʹ��Ӫҵ����----------------");
		for (int i = 0; i < menus.length; i++) {
			System.out.print(menus[i]+"\t");
		}
	}

	// ��ʾ��ѡ����
	private static void shownums() {
		System.out.println("----------------��ӭʹ��Ӫҵ����----------------");
		for (int i = 0; i < 9; i++) {// ѭ���ŴΣ������Ÿ��������
			String number = "139";// ����绰������139��ͷ
			Random random = new Random();
			for (int j = 0; j < 8; j++) {
				number += random.nextInt(9);
				nums[i] = number;	
			}
			if (i % 3 == 0)
				System.out.println();
			System.out.print(i + 1 + "." + number + "\t");// ���һ���绰����
		}
	}

	// ��ʾ�ײ�˵��
	private static void showPackage() {
		TalkPackage tp = new TalkPackage();
		tp.showInfo();
		NetPackage np = new NetPackage();
		np.showInfo();
		SuperPackage sp = new SuperPackage();
		sp.showInfo();
	}
}
