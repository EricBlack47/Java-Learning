package neibulei;

public class InnerClazzTest {
	public static void main(String[] args) {
		/**
		 * �Ǿ�̬�ڲ������
		 */
		MainTest mt = new MainTest();// �����ⲿ�����
		MainTest.Inner1 i1 = mt.new Inner1();// �����ڲ������
		i1.show();
		System.out.println(mt.getX());
		System.out.println(i1.getY());

		/**
		 * ��̬�ڲ������ 
		 * ��̬�ڲ���ֻ�ܷ����ⲿ��̬��Ա�������ڲ������ʱ���ô����ⲿ�����
		 */
		MainTest.Inner2 i2 = new MainTest.Inner2();
		i2.show();

		
		// �ڲ��ࣨ�����η���������
		class Inner3{
			int x;
		}	
		Inner3 a=new Inner3();
		a.x=7;
		System.out.println(a.x);
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
		};
	}
}
