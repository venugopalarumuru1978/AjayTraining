import java.util.Scanner;

public class ifex3 {

	public static void main(String[] args) {
		// else -if 
		// big number from 3 numbers

		Scanner scObj =new Scanner(System.in);
		System.out.println("Enter any 3 values ");
		int x = scObj.nextInt();
		int y = scObj.nextInt();
		int z = scObj.nextInt();
		
		// x=10,y=5,z=6 = x is big
		// x=10,y=50,z=6 = y is big
		// x=10,y=50,z=60 = z is big
		// x=10,y=4,z=4 = x is big
		// x=10,y=10,z=4 = any two or all values are same
		
		if(x>y && x>z)
			System.out.println("First is big");
		else if(y>x && y>z)
			System.out.println("Second is big");
		else if(z>x && z>y)
			System.out.println("Third is big");
		else
			System.out.println("Any two or all values are same");
	}
}

