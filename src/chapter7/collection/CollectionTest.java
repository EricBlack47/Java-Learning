package chapter7.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
	
	public static void main(String[] args) {
		Collection c=new ArrayList<>();//�������϶���
		//���������Ԫ��
		c.add("hello");
		c.add("world");
		c.add("java");
		for (Object collection : c) {
			System.out.println(collection);			
		}
		//�Ӽ������Ƴ�Ԫ��
		System.out.println("--------------------");
		c.remove("java");//�Ƴ�һ�����϶���
		//c.clear();//��ռ��϶���
		for (Object object : c) {
			System.out.println(object);			
		}
		//�жϼ������Ƿ����ָ��Ԫ��
		System.out.println("contains:"+c.contains("hello"));
		System.out.println("contains:"+c.contains("java"));
		//�жϼ����Ƿ�Ϊ��
		System.out.println("isEmpty:"+c.isEmpty());
		//���ϳ���
		System.out.println("int size:"+c.size());
	}
}
