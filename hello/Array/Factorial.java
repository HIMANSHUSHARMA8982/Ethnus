package Array;

public class Factorial {
	public static void main(String[] args) {
		int fab=1;
		int a[]= {1,2,3,4,5};
		for(int i=1;i<a.length;i++) {
			if(i%2==0) {
				int y=1;
				while(y <=a[i]) {
					
					fab=fab*y;
					y++;
				}
				System.out.println("factorial of "+a[i]+ " is: "+fab);
				
			}
			
			
			
		}
		
	}


}
