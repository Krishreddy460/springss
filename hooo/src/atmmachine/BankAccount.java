package atmmachine;

abstract class BankAccount
{
	
	private int accNo;
	private String accName;
	double accBal;
	
	
	
	public BankAccount(int accNo, String accName, double accBal) {

		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public void showBalance()
	{
		System.out.println("the  amount in your account is "+accBal);
	}
	public abstract double withdraw(double amount);
	public abstract double deposit(double amount);
	
	@Override
	public String toString() 
	{
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}	
}
