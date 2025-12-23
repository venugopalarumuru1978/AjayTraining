package getsetpack;

public class testMain {

	public static void main(String[] args) {

		TestClass tc1 = new TestClass();
		tc1.setX(10);
		tc1.setY(12.45f);
		
		System.out.println("X val : " + tc1.getX());
		System.out.println("Y val : " + tc1.getY());
	}

}
