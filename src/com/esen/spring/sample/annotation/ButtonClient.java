package com.esen.spring.sample.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ButtonClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "annotation.xml" });
		Button bt = context.getBean("button", Button.class);
		bt.poll();
	}
}
