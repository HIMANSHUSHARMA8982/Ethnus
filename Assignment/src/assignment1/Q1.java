package assignment1;
import java.util.Scanner;

class Triangle{
	int b;
	int h;
	int getArea() {
		return ((h*b)/2);
		
	}
}

public class Q1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Triangle t= new Triangle();
		System.out.println("enter sides of triangle");
		for(int i=0;i<2;i++) {
			if(i==0) {
				t.h=s.nextInt();
				
			}
			else if(i==1) {
				t.b=s.nextInt();
			}
		}
		System.out.println(t.getArea());
	}

}
