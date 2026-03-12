package coms.beans;

public class Account {

	private String AccNo;
	private String BankName;
	
	public String getAccNo() {
		return AccNo;
	}
	public void setAccNo(String accNo) {
		AccNo = accNo;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	
	public void PrintAcc()
	{
		System.out.println("Account Number : " + this.getAccNo());
		System.out.println("Bank Name : " + this.getBankName());
	}
}
