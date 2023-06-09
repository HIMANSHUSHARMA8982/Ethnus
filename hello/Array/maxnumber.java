package Array;

public class maxnumber {
	public static void main(String[] args) {
		int a[]= {120,130,2,50,1};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		System.out.println(max);

	}

}
