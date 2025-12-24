package staticpack;

public class DemoStatic {

	private static int x, y;	
	
	public static void getVals(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public static void putVals()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
		int sum = x+y;
		System.out.println("Sum Val : " + sum);
	}
}
