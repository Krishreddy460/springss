package tasks;



import java.sql.Timestamp;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshEventHandler implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Context refreshed at : "+new Timestamp(System.currentTimeMillis()));
	}
}