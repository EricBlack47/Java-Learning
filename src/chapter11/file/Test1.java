package chapter11.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
		File file=new File("e:\\Test1.txt");//选取路径文件
		if(!file.exists()) {//文件是否存在
			file.createNewFile();//如果没有文件，则生成文件
		}
		boolean b3=file.canWrite();
		System.out.println(b3);
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.setReadOnly());
		
		File file2=new File("e:\\Test");
		boolean b1=file2.exists();//文件夹是否存在
		System.out.println(b1);
		boolean b2=file2.mkdirs();//生成文件夹
		System.out.println(b2);
		
		Date d1=new Date(file2.lastModified());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		System.out.println(sdf.format(d1));
		//查看有几个盘
		File[] fs=File.listRoots();
		for (File f : fs) {
			System.out.println(f.getPath());			
		}
		//查看目录文件
		File[] fs2=fs[2].listFiles();//fs[2]为第二个盘==>e盘
		for (File fi : fs2) {
			System.out.println(fi.getCanonicalPath());
		}
	}
}
