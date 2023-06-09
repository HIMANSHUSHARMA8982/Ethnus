package Array;
import java.util.Scanner;

public class Arraydemo {
	public static void main(String[] args) {
		int a[]= {4,3,25,77,4};
		int[] b= {1,2,3,4,5};
		int c[]= new int[5];
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your array: ");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
			c[i]= s1.nextInt();
			System.out.println(c[i]);
			
			
		}
		
	}
}
