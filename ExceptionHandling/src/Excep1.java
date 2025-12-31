import java.util.Scanner;

public class Excep1 {

	public static void main(String[] args) {
			// Division of two numbers
		
		/*
		 * 10/5 = 2
		 * 0/2 = 0
		 * 5/0 = infinity
		 */
	try
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two values");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int div = x/y;
		System.out.println("Division : " + div);
	}
	catch(Exception ex)
	{
		System.out.println(ex);
		System.out.println("Value should not divide with zero");
	}
	}
}

//ArithmeticException
//InputMismatchException

