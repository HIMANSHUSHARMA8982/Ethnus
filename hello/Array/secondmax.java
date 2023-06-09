package Array;

public class secondmax {
	public static void main(String[] args) {
		int a[]= {120,130,2,50,1};
		
		
		for(int j=1;j<a.length;j++) {
			for(int i=0;i<j;i++) {
			
				int max=0;
				if(a[i]>a[j]) {
					max=a[i];
					a[i]=a[j];
					a[j]=max;
					
				}
			}}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[a.length- i-1]);

	}}
	

}
