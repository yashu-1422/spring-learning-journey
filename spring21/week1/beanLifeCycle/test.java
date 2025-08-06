package com.springcore.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanLifeCycle/config.xml");
			samosa s1 = (samosa) context.getBean("s1");
			System.out.println(s1);
			
			//pre-shutdown hook for close bean life cycle
			//AbstractApplicationContext
			context.registerShutdownHook();

}
}
