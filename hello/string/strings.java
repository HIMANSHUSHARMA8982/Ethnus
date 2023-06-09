package string;

public class strings {
	public static void main(String[] args) {
		String s1="Bangalore";
		String s2=new String("Bangalore");
		if(s1==s2) {
			System.out.println("yes there adresss are same");
			
		}else {
			System.out.println("No there address are not same");
			
		}
		if(s1.equals(s2)) {
			System.out.println("yes there values are same");
			
		}else {
			System.out.println("no there values are not same");
		}
		
		// reverse the string
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			
		}System.out.print(rev);
	}

}
