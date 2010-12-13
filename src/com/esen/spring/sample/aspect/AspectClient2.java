package com.esen.spring.sample.aspect;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.esen.spring.sample.aop.IStudent;

public class AspectClient2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "aspect2.xml" });
		AspectExecute exe = ctx.getBean("execute", AspectExecute.class);
		exe.execute();
		System.out.println();
		exe.dispose();
		
//		Date d = new Date();
//		for (int i = 0; i < 1000000; i++) {
//			exe.execute();
//		}
//		Date d1 = new Date();
//		System.out.println((d1.getTime() - d.getTime()));		
	}
}
