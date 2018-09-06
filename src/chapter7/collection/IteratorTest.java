package chapter7.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Tom");
		list.add("and");
		list.add("Jerry");

		System.out.println("---------list����---------");
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println("---------foreach����------");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("---------iterator����-----");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------remove----------");
		String s1 = list.remove(0);
		System.out.println(list);
		boolean b = list.removeAll(list);
		System.out.println(b);
		System.out.println("---------clear-----------");
		list.clear();
		System.out.println(list);
		System.out.println("---------indexof---------");
		List<String> list2 = new ArrayList<>();
		list2.addAll(list);
		System.out.println(list2.indexOf("Jerry"));//�±�Ϊ-1˵��û�����飬Ϊ��
		list2.add("Alice");
		System.out.println(list2.indexOf("Alice"));//�ַ�������ĵ�һλ�±�Ϊ0
	    System.out.println("---------contains--------");
	    System.out.println(list2.contains("Alice"));
	}
}
