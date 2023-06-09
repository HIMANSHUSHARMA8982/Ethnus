package hello;

public class greatest_no {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		int c=9;
		if((a>b) && (b>c)) {
			System.out.printf("%d is greatest no.",a);
		} 
		else if((b>a)&&(b>c)) {
			System.out.printf("%d is the greatest", b);
		}
		else {
			System.out.printf("%d is the greatest",c);
		}
		// TODO Auto-generated method stub

	}

}
