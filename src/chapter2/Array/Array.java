package chapter2.Array;

public class Array {
	public static void main(String[] args) {
		/*int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			 a[i]=2*i+1;
	        System.out.println(" "+a[i]);
		}
		*/ 
		
		//菲波拉契数前20项
		int[] a=new int[20];
		a[0]=1;
		a[1]=1;
		for(int i=2;i<a.length;i++) {						
			a[i]=a[i-2]+a[i-1];			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
				
	}
   
}
