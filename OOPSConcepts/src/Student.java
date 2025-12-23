import java.util.Scanner;

public class Student {

	String sname;
	int sub1, sub2;
	
	void getStd()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Std name and two subject marks");
		sname = sc.next();
		sub1 =sc.nextInt();
		sub2 = sc.nextInt();
	}
	
	void printStd()
	{
		System.out.println("Std Name : " + sname);
		System.out.println("Sub-1 : " + sub1 + "\tSub-2 : " + sub2);
		System.out.println("Total Marks :  " + (sub1+sub2));
	}
}

