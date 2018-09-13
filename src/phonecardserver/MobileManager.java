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
	private static String[] menus = { "1.用户登录", "2.用户注册", "3.使用卡", "4.话费充值", "5.资费说明", "6.退出系统" };
	private static String[] menus2 = { "1.本月账单查询", "2.套餐余量查询", "3.打印消费详单", "4.套餐变更", "5.办理退网" };
	private static String[] nums = new String[9];
	private static String[] pack = { "1.话痨套餐", "2.网虫套餐", "3.超人套餐" };

	public static void main(String[] args) {
		CardUtil.initScene();
		showMenu();
		CardUtil.cards = new HashMap<>();
		while (true) {
			System.out.println("\r"+"请输入您选择的业务:");
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
					// 使用卡
					System.out.println("请输入卡号：");
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
					System.out.println("再见");
					return;
				default:
					System.out.println("输入有误！");
				}
			} catch (Exception e) {
				sc.nextLine();
				e.printStackTrace();
				System.out.println("输入有误！");
			}
			showMenu();
		}
	}

	// 二级菜单
	private static void menu2(String num) {
		showMenu2();
		while (true) {
			System.out.println("\r"+"请输入（1~5）选择的业务:");
			System.out.println("输入其他数字返回上级菜单！");
			try {
				int select = sc.nextInt();
				switch (select) {
				case 1:
					// 本月账单查询
					System.out.println("----------------账单查询----------------");
					CardUtil.showAmountDetail(num);
					break;
				case 2:
					// 套餐余额查询
					CardUtil.showRemainDetail(num);
					break;
				case 3:
					// 打印消费单
					CardUtil.addConsumInfo(num, (ConsumInfo) CardUtil.consumInfos);
					CardUtil.printConsunmInfo(num, (ConsumInfo) CardUtil.consumInfos);
					break;
				case 4:
					// 套餐变更
					showPackage();
					CardUtil.changePack(num, sc);
					System.out.println("成功更换套餐!："+CardUtil.cards.get(num));
					break;
				case 5:
					CardUtil.delCard(num);
					System.out.println("您已经成功退网");
					// 办理退网
					break;
				case 6:
					return;
				}

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("输入有误！");
			}
			showMenu2();
		}
	}

	// 充钱
	private static void chargemoney() {
		System.out.println("请输入手机卡号：");
		String phonenum = sc.next();
		System.out.println("请输入充值余额：");
		double strMoney = sc.nextInt();
		int sumMoney = CardUtil.chargeMoney(phonenum, strMoney);
		System.out.println("充值成功！充值后余额为：" + sumMoney);
	}

	// 注册账号
	private static void registered() {
		shownums();
		System.out.println("\r");	
		MobileCard mc = new MobileCard();
		System.out.println("请选择一个号码:");
		int selectNum = sc.nextInt();
		System.out.println(nums[selectNum-1]);
		mc.setCardNumber(nums[selectNum-1]);
		System.out.println("请选择套餐类型:");
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
		System.out.println("请输入您的用户名");
		String name = sc.next();
		mc.setUserName(name);
		System.out.println("请输入您的密码");
		String pword = sc.next();
		mc.setPassWord(pword);
		System.out.println("请输入您预存金额");
		double putmoney = sc.nextDouble();
		while (putmoney < mc.getServicePackage().price) {
			System.out.println("您的预存款不足支付套餐，请重新输入");
			putmoney = sc.nextDouble();
		}
		if (putmoney >= mc.getServicePackage().price) {
			double leftMoney = putmoney - mc.getServicePackage().price;
			System.out.println("充值成功！您剩余话费为：" + leftMoney);
			mc.setMoney(leftMoney);
		}
		System.out.println(mc);
		mc.getServicePackage().showInfo();
		//System.out.println(SPConfig.getConfig(selectPackage));
		CardUtil.cards.put(nums[selectNum - 1], mc);
	}

	// 登录账号
	private static void login() {
		try {
			System.out.println("请输入您的手机号码:");
			String num = sc.next();
			System.out.println("请输入您的密码:");
			String pw = sc.next();
			String passkey = CardUtil.cards.get(num).getPassWord();
			if (pw.equals(passkey)) {
				System.out.println("登录成功！");
				menu2(num);
			}else {
				System.out.println("登录失败！");
			}
		} catch (Exception e) {
			System.out.println("账号不存在！");
		}

	}

	// 显示二级界面
	private static void showMenu2() {
		System.out.println("----------------欢迎登录用户大厅----------------");
		for (int i = 0; i < menus2.length; i++) {
			System.out.print(menus2[i]+"\t");
		}
	}

	// 显示界面
	private static void showMenu() {
		System.out.println("----------------欢迎使用营业大厅----------------");
		for (int i = 0; i < menus.length; i++) {
			System.out.print(menus[i]+"\t");
		}
	}

	// 显示可选号码
	private static void shownums() {
		System.out.println("----------------欢迎使用营业大厅----------------");
		for (int i = 0; i < 9; i++) {// 循环九次，产生九个随机号码
			String number = "139";// 定义电话号码以139开头
			Random random = new Random();
			for (int j = 0; j < 8; j++) {
				number += random.nextInt(9);
				nums[i] = number;	
			}
			if (i % 3 == 0)
				System.out.println();
			System.out.print(i + 1 + "." + number + "\t");// 输出一个电话号码
		}
	}

	// 显示套餐说明
	private static void showPackage() {
		TalkPackage tp = new TalkPackage();
		tp.showInfo();
		NetPackage np = new NetPackage();
		np.showInfo();
		SuperPackage sp = new SuperPackage();
		sp.showInfo();
	}
}
