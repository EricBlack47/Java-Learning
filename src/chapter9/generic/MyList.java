package chapter9.generic;

public class MyList<T> {
	
	private T[] arr;
	private int index=0;
	
	public MyList(int size) {
		arr= (T[]) new Object[size];
	}
	
	public void set(T o) {
		arr[index]=o;
		index++;
	}
	
	public T get(int index) {
		return arr[index];
	}
	
	public void print() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}

}
