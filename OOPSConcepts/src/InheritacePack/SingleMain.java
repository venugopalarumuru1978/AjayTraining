package InheritacePack;

class DemoParent
{
	protected int x, y;
	
	public void getVal(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class DemoChild extends DemoParent
{
	private int sum;
	
	public void putVal()
	{
		sum = x+y;
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
		System.out.println("Sum val : " + sum);
	}
}

public class SingleMain {

	public static void main(String[] args) {
			DemoChild dc1 = new DemoChild();
			dc1.getVal(11, 20);
			dc1.putVal();
	}
}
