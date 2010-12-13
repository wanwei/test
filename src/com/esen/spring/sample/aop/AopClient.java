package com.esen.spring.sample.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopClient {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "noaop.xml" });
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "aop.xml" });
		IStudent person = (IStudent) ctx.getBean("student");
		person.addStudent("ww");
		System.out.println();
		person.addStudent("wanwei");
	}

}
