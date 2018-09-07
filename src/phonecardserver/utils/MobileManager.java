package phonecardserver.utils;

import java.util.Scanner;

public class MobileManager {
	
	private static String[] menus= {"1.用户登录","2.用户注册","3.使用卡","4.话费充值","5.资费说明","6.退出系统"};
	
	public static void main(String[] args) {
		showMenu();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("请输入您选择的业务:");
			try {
				int select=sc.nextInt();
				switch(select) {
				case 1:System.out.println("登录");break;
				case 2:System.out.println("注册");break;
				case 3:System.out.println("使用");break;
				case 4:System.out.println("充值");break;
				case 5:System.out.println("咨询");break;
				case 6:System.out.println("再见");
				sc.close();return;
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

	private static void showMenu() {
		System.out.println("----------------欢迎使用营业大厅----------------");
		for(int i=0;i<menus.length;i++) {
			System.out.println(menus[i]);
		}
	}

}
