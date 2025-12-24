package staticpack;

public class StaticEx {

	public static void main(String[] args) {
		
		DemoStatic.getVals(10, 20);
		DemoStatic.putVals();
	
		DemoStatic.getVals(40, 120);
		DemoStatic.putVals();
		// ---------
		System.out.println("------------------");
		Customer c1 = new Customer();
		c1.getCustomerInfo("Varun", 100000);
		
		Customer c2 = new Customer();
		c2.getCustomerInfo("Vani", 300000);
		
		c1.CustoerInfo();
		c2.CustoerInfo();
		
		Customer.BankBalance();
		System.out.println("------------------");
		// -----
		CustomerFun cf1 = new CustomerFun();
		cf1.getCustomerInfo("Naresh", 1000);

		CustomerFun cf2 = new CustomerFun();
		cf2.getCustomerInfo("Ramesh", 3000);
		
		cf1.CustoerInfo();
		cf2.CustoerInfo();
		
		CustomerFun.BankBalance();

		
	}
}
