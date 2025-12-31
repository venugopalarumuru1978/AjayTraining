import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep4 {

	public static void main(String[] args) {
	try
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Age");
		int age = sc.nextInt();
		
		if(age>=18)
			System.out.println("New Voter is Reg");
		else
			throw new InvalidAgeException("Person Age is Below 18");
	}
	catch(InvalidAgeException  ag)
	{
		System.out.println(ag);
	}
	catch(InputMismatchException  im)
	{
		System.out.println("Please enter only numbers");
	}
	catch(Exception ex)
	{
		System.out.println(ex);		
	}
	}
}

