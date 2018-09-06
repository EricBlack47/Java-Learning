package chapter11.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HowToCheckAllFiles {

	public static void main(String[] args) throws IOException {
		//用递归法查找选中路径中文件夹内所有文件;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入查看路径:");
		String path = scanner.nextLine();
		File file = new File(path);
		list(file);
		scanner.close();
	}
	private static void list(File file) {
		if (file.isFile()) {
			System.out.println(file.getPath());
			return;
		}
		File[] fs = file.listFiles();
		if(fs==null) return;
		for (File f : fs) {
			if (file.isDirectory()) {
				list(f);
			} else
				System.out.println(f.getPath());
		}
	}
}
