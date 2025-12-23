package conspack;

public class ConsParams {

	int x, y;
	
	ConsParams(int x, int y)
	{
		// constructor
		System.out.println("Constructor with para-meters");
		this.x = x;
		this.y = y;
	}
	
	void printVal()
	{
		System.out.println("X value is : " +x);
		System.out.println("Y value is : " +y);
	}
}

