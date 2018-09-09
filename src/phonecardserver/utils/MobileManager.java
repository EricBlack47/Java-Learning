package phonecardserver.utils;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import phonecardserver.MobileCard;
import phonecardserver.NetPackage;
import phonecardserver.SuperPackage;
import phonecardserver.TalkPackage;

public class MobileManager {
	private static Map<String,MobileCard> cards;

	private static String[] menus = { "1.用户登录", "2.用户注册", "3.使用卡", "4.话费充值", "5.资费说明", "6.退出系统" };
	private static String[] nums = new String[9];
	private static String[] pack = { "1.话痨套餐", "2.网虫套餐", "3.超人套餐" };

	public static void main(String[] args) {
		showMenu();
		Scanner sc = new Scanner(System.in);
		MobileCard mc = new MobileCard();

		while (true) {
			System.out.println("请输入您选择的业务:");
			try {
				int select = sc.nextInt();
				switch (select) {
				case 1:
					login();// 登录
					break;
				case 2:
					registered();// 注册
					// System.out.println("注册");
					break;
				case 3:
					System.out.println("使用");
					break;
				case 4:
					//CardUtil.chargeMoney(nums, money);
					//System.out.println("充值");
					break;
				case 5:
					System.out.println("咨询");
					break;
				case 6:
					System.out.println("再见");
					return;
				default:
					System.out.println("输入有误！");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("输入有误！");
			}
			showMenu();
		}

	}

	

	// 注册账号
	private static void registered() {
		shownums();
		MobileCard mc = new MobileCard();
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择一个号码:");
		int selectNum = sc.nextInt();
		System.out.println(nums[selectNum - 1]);
		mc.setCardNumber(nums[selectNum - 1]);
		System.out.println("请选择套餐类型:");
		for (String string : pack) {
			System.out.println(string);
		}
		int selectPackage = sc.nextInt();
		if (selectPackage == 1)
			mc.setServicePackage(new TalkPackage());
		if (selectPackage == 2)
			mc.setServicePackage(new NetPackage());
		if (selectPackage == 3)
			mc.setServicePackage(new SuperPackage());
		System.out.println("请输入您的用户名");
		String name = sc.next();
		mc.setUserName(name);
		System.out.println("请输入您的密码");
		String pword = sc.next();
		mc.setPassWord(pword);
		System.out.println(mc);
	}

	// 登录账号
	private static void login() {
		System.out.println("请输入您的手机号:");
		Scanner s = new Scanner(System.in);
		String num = s.next();
		CardUtil.isExistCard(num);
	}

	// 显示界面
	private static void showMenu() {
		System.out.println("----------------欢迎使用营业大厅----------------");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
	}

	// 显示可选号码
	private static void shownums() {
		System.out.println("----------------欢迎使用营业大厅----------------");
		for (int i = 0; i < 9; i++) {// 循环九次，产生九个随机号码
			String number = "139";// 定义电话号码以139开头
			Random random = new Random();
			for (int j = 0; j < 8; j++) {
				nums[i] = number;
				number += random.nextInt(9);
			}
			System.out.println(i + 1 + "." + number);// 输出一个电话号码
		}
	}
}
