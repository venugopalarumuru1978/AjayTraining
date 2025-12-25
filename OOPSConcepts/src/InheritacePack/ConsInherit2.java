package InheritacePack;

//Super class
class Vehicles {
  Vehicles(String company) 
  {
      System.out.println("This is a Vehicle : " + company);
  }
}

//Subclass 
class Cars extends Vehicles {
	 Cars(String cModel, String com) {
		 super(com);		 
	      System.out.println("This Vehicle is Car : " + cModel);
	  }
}



public class ConsInherit2 {

	public static void main(String[] args) {
		
		Cars  cinfo = new Cars("Sweipt", "Maruthi");

	}

}
