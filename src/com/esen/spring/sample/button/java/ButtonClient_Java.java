package com.esen.spring.sample.button.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.esen.spring.sample.button.Button;
import com.esen.spring.sample.button.Lamp;

public class ButtonClient_Java {
	public static void main(String[] args) {		
		ApplicationContext context = new  AnnotationConfigApplicationContext(ButtonConfig.class);		
		Button bt = context.getBean(Button.class);
		bt.poll();
		
		System.out.println();
		Lamp l = context.getBean(Lamp.class);
		l.turnOn();
	}
}
