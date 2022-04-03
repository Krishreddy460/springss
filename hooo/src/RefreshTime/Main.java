package RefreshTime;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{

	public static void main(String[] args)
	{
		AbstractApplicationContext c=new ClassPathXmlApplicationContext("bean.xml");
		c.refresh();
	}
}
