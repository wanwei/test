package com.esen.spring.sample.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ButtonClient {
	public static void main(String[] args) {		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "autowire.xml" });		
		Button bt = context.getBean("button", Button.class);
		bt.poll();
		
		//使用innerbean的实现
		//bt = context.getBean("buttoninner", Button.class);
		//bt.poll();
	}
}
