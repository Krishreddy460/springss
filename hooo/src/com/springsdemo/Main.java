package com.springsdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.Resource;


public class Main 
{
public static void main(String[] args)
{

	
	
/*	Resource re=new ClassPathResource("beans.xml");
	BeanFactory f=new XmlBeanFactory(re);
	
	Employee12 e1=(Employee12)f.getBean("emp1");
	System.out.print(e1);
*/
	
	ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	Employee12 ee=c.getBean("emp1",Employee12.class);
	System.out.print(ee);
	
	
	
	
}
}
