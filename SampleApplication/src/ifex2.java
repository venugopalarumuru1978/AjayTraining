import java.util.Scanner;

public class ifex2 {

	public static void main(String[] args) {
		// simple if - else
		// even or odd

		Scanner scObj =new Scanner(System.in);
		System.out.println("Enter any value ");
		int n = scObj.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Even Number");
		}		
		else
		{
			System.out.println("Odd Number");
		}
	}
}

