import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep2 {

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
	catch(ArithmeticException ae)
	{
		System.out.println("Value should not divide with zero");
	}
	
	catch(InputMismatchException im)
	{
		System.out.println("Enter only integer values");
	}
	
	catch(Exception ex)
	{
		System.out.println(ex + " Unknown Error");
	}
	finally
	{
		System.out.println("Program Execution is Done");
	}
	}
}

