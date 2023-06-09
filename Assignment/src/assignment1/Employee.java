package assignment1;

public class Employee {
	String name;
	int YearOfJoining;
	String address;
	void name(String n) {
		name=n;
	}
	void YOJ(int y) {
		YearOfJoining=y;
	}
	void Address(String a) {
		address=a;
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.name("Robert");
		e2.name("Sam");
		e3.name("John");
		e1.YOJ(1994);
		e2.YOJ(2000);
		e3.YOJ(1999);
		e1.Address("64C- Wall Street");
		e2.Address("68D- Wall Street");
		e3.Address("26B- Wall Street");
		System.out.println("Name"+"\t"+"Year of joining"+"\t"+"Address");
		System.out.println(e1.name+"\t"+e1.YearOfJoining+"\t"+e1.address);
		System.out.println(e2.name+"\t"+e2.YearOfJoining+"\t"+e2.address);
		System.out.println(e3.name+"\t"+e3.YearOfJoining+"\t"+e3.address);
		
	}

}
