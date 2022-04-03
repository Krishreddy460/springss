package atmmachine;

import org.springframework.context.ApplicationEvent;

public class WithdrawalEvent extends ApplicationEvent
{
	/**
	 * 
	 */


	public WithdrawalEvent(Object source) {
		super(source);	
	}



	int amount;
	BankAccount bankac;
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankac = bankAccount;
	}
	

	
	public String message() {
		return "Amount withdrawn: "+this.amount+" Balance: "+this.bankac.getAccBal();
	}
	
}

