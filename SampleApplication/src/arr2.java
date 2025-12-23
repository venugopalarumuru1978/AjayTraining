import java.util.Scanner;

public class arr2 {

	public static void main(String[] args) {
			int x[] = new int[5];
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter " + x.length + " Values");
			for(int i=0;i<x.length;i++)
			{
				x[i] =  sc.nextInt();
			}
			// calculate sum of array values 
			int sum = 0;
			System.out.println("Array Values ");
			for(int i=0;i<x.length;i++)
			{
				sum = sum + x[i];
				System.out.print(x[i] + "\t");
			}
			System.out.println("\nSum Value : " + sum);
	}
}
