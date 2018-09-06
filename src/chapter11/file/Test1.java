package chapter11.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
		File file=new File("e:\\Test1.txt");//ѡȡ·���ļ�
		if(!file.exists()) {//�ļ��Ƿ����
			file.createNewFile();//���û���ļ����������ļ�
		}
		boolean b3=file.canWrite();
		System.out.println(b3);
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.setReadOnly());
		
		File file2=new File("e:\\Test");
		boolean b1=file2.exists();//�ļ����Ƿ����
		System.out.println(b1);
		boolean b2=file2.mkdirs();//�����ļ���
		System.out.println(b2);
		
		Date d1=new Date(file2.lastModified());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");
		System.out.println(sdf.format(d1));
		//�鿴�м�����
		File[] fs=File.listRoots();
		for (File f : fs) {
			System.out.println(f.getPath());			
		}
		//�鿴Ŀ¼�ļ�
		File[] fs2=fs[2].listFiles();//fs[2]Ϊ�ڶ�����==>e��
		for (File fi : fs2) {
			System.out.println(fi.getCanonicalPath());
		}
	}
}
