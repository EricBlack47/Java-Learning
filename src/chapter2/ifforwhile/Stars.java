package chapter2.ifforwhile;

public class Stars {
	public static void main(String[] args) {
		for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4-x; y++)
            	System.out.print(" ");
            for (int k = 0; k < 2*x+1; k++)
            	System.out.print("*");
            System.out.print("\n");
	}
		for (int x = 0; x < 4; x++) {
            for (int y = 4; y > 2-x; y--)
            	System.out.print(" ");
            for (int k = 2*x+1; k <= 5; k++)
            	System.out.print("*");
            System.out.print("\n");}
}
}