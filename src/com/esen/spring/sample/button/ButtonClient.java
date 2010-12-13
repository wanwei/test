package com.esen.spring.sample.button;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ButtonClient {
	public static void main(String[] args) {		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "button.xml" });		
//		Button bt = context.getBean("button", Button.class);
//		bt.poll();
		//()context.getBean("button");
		//使用innerbean的实现
		Button bt = context.getBean("buttoninner", Button.class);
		bt.poll();
	}
}
