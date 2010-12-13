package com.esen.spring.sample.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentImpl implements IStudent {

	@Override
	public void addStudent(String name) {
		System.out.println("欢迎" + name + "加入!  ");
	}
}
