package atmmachine;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(int accNo, String accName, double accBal) {
		super(accNo, accName, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double withdraw(double amount) 
	{
		if(getAccBal()<=amount)
		{
			showBalance();
			System.out.println("soo withdraw the amount which is less than in your bank account");
			return -1;
			
		}

		else if(amount>30000)
		{
				System.out.println("amount above 30000 cant be withdraw");
				return -1;
		}
		else
		{
			double curr=getAccBal()-amount;
			setAccBal(curr);
			System.out.println("the amount withdraw is done  and your curtrent balance is"+getAccBal());
		}
		return 0;
	}

	@Override
	public double deposit(double amount)
	{
		if(amount>100000)
		{
			System.out.print("morethan 100000 cant be depositedd");
			return -1;
		}
		else
		{
		setAccBal(getAccBal()+amount);
		showBalance();
		}
	
		return 0;
	}

}
