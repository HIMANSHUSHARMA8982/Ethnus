package Array;

public class sumofallcolumn {
	public static void main(String[] args) {
		int row=3;
		int col=3;
		int s=0;
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				s=s+a[j][i];
				System.out.print(a[i][j]+" ");
				

				
			}
			
			System.out.println(s);
			System.out.println();
		}
		int p=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					p=p*a[i][j];
					
				}
				
			}
			
		}
		System.out.println(p);
		int p1=1;
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<col;j++) {
				if(i+j==2) {
				
				
					p1=p1*a[i][j];
					
				
				
			}
			}
		}
		System.out.println(p1);
	}

}
