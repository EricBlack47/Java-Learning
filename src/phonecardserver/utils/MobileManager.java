package phonecardserver.utils;

import java.util.Scanner;

public class MobileManager {
	
	private static String[] menus= {"1.�û���¼","2.�û�ע��","3.ʹ�ÿ�","4.���ѳ�ֵ","5.�ʷ�˵��","6.�˳�ϵͳ"};
	
	public static void main(String[] args) {
		showMenu();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("��������ѡ���ҵ��:");
			try {
				int select=sc.nextInt();
				switch(select) {
				case 1:System.out.println("��¼");break;
				case 2:System.out.println("ע��");break;
				case 3:System.out.println("ʹ��");break;
				case 4:System.out.println("��ֵ");break;
				case 5:System.out.println("��ѯ");break;
				case 6:System.out.println("�ټ�");
				sc.close();return;
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

	private static void showMenu() {
		System.out.println("----------------��ӭʹ��Ӫҵ����----------------");
		for(int i=0;i<menus.length;i++) {
			System.out.println(menus[i]);
		}
	}

}
