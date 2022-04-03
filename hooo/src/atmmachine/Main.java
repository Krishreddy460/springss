package atmmachine;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("bank.xml");
		SalaryAccount s=(SalaryAccount)context.getBean("salary");
		s.deposit(1000);
		
		WithdrawPublisher publisher=(WithdrawPublisher)context.getBean("publisher");
		
	
		 if(s.withdraw(100)==0)
			 publisher.publish(100, s);
		
		System.out.print(s);
	}
}
