package chapter7.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> stack = new LinkedList<>();
		stack.push("111");// ��ջ
		stack.push("222");
		stack.push("333");
		stack.push("444");
		String s1 = stack.getFirst();// ��ȡջ������ɾ����
		System.out.println(s1);
		String s4= stack.removeLast();
		System.out.println(s4);
		while (!stack.isEmpty()) {
			String s = stack.pop();// ��ջ
			System.out.println(s+" "+stack.size());
		}
		
		System.out.println("-------------��-----------------------");
		LinkedList<String> queue = new LinkedList<>();
		queue.offer("�ϵ�");// ���
		queue.offer("�Ϻ�");
		queue.offer("�Ϲ�");
		System.out.println(queue.getFirst() + " " + queue.getLast());
		while (!queue.isEmpty()) {
			String s2 = queue.poll();// �˶�
			System.out.println(s2+" "+queue.size());
		}
		
		System.out.println("-------------------TreeSet---------------");
		TreeSet<String> stack1=new TreeSet<>();
		stack1.add("111");
		stack1.add("333");
		stack1.add("666");
		stack1.add("444");
		stack1.add("555");
		stack1.add("c");
		stack1.add("d");
		stack1.add("a");
		stack1.add("b");
		String s5=stack1.higher("555");
		System.out.println(s5);
		for (String s3 : stack1) {
			System.out.println(s3);		
		}
		
		System.out.println("----------------HashSet------------------------");
		 HashSet<String> hs=new HashSet<>();
		 hs.add("33");
		 hs.add("11");
		 hs.add("22");
		 hs.add("c");
		 hs.add("a");
		 hs.add("b");
		 hs.add(null);
		 hs.add(null);
		 for (String s6 : hs) {
			 System.out.println(s6);			
		}		 
	}  	
}
