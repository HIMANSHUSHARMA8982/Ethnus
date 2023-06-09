package scanner;

public class Happynumber {
	public static void main(String[] args) {
		int n=82;
		Square(n);
		
		
	}

	private static void Square(int n) {
		
		if(n==1) {
			System.out.println("yes");
			return;
		}
		else {
			int sum =0;
			while(n!=0) {
				int last=n%10;
				int square=last*last;
				sum=sum+square;
				n=n/10;
		}
		System.out.println(sum);		
		
		Square(sum);
		}
	}}
