package Array;
public class sumofallmatrixrow {
	public static void main(String[] args) {
		int row=3;
		int col=3;
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int s=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++){
				
				s=s+a[i][j];
				System.out.print(a[i][j]+" ");
				

			}
			System.out.print(s);
			System.out.println();
			}
	}
}
