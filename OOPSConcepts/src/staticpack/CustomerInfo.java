package staticpack;

public class CustomerInfo {

	private String cname;
	private int acc_bal;
	private static int bank_bal;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public int getAcc_bal() {
		return acc_bal;
	}
	public void setAcc_bal(int acc_bal) {
		this.acc_bal = acc_bal;
	}
	
	public static int getBank_bal() {
		return bank_bal;
	}
	
	public static void setBank_bal(int bank_bal) {
		CustomerInfo.bank_bal = bank_bal;
	}

	
}
