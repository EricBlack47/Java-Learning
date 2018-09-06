package chapter12.threadtest;

public class Prodoucer<T> {

	private T[] arr;// 容器大小
	private int index = 0;// 馒头下标

	public Prodoucer(int size) {
		arr = (T[]) new Object[size];
	}

	public synchronized void put(T o) {
		while (index == arr.length) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		arr[index] = o;
		index++;
		notify();
	}

	public synchronized T get() {
		while (index == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		index--;
		notify();
		return arr[index];
	}

}
