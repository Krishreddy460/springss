package atmmachine;
import org.springframework.context.ApplicationListener;

public class WithdrawListner implements ApplicationListener<WithdrawalEvent> {
	
	static
	{System.out.print("krishna");
	}
	private void sendSMS(String msg)
	{
		System.out.println(msg);
	}
	
	public void onApplicationEvent(WithdrawalEvent event) 
	{	
		 sendSMS(event.message());
	}
}
