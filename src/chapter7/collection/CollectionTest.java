package chapter7.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
	
	public static void main(String[] args) {
		Collection c=new ArrayList<>();//创建集合对象
		//往集合添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		for (Object collection : c) {
			System.out.println(collection);			
		}
		//从集合中移除元素
		System.out.println("--------------------");
		c.remove("java");//移除一个集合对象
		//c.clear();//清空集合对象
		for (Object object : c) {
			System.out.println(object);			
		}
		//判断集合中是否包含指定元素
		System.out.println("contains:"+c.contains("hello"));
		System.out.println("contains:"+c.contains("java"));
		//判断集合是否为空
		System.out.println("isEmpty:"+c.isEmpty());
		//集合长度
		System.out.println("int size:"+c.size());
	}
}
