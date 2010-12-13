package com.esen.spring.sample.aspect;

import org.springframework.test.context.transaction.TransactionConfiguration;

public class AspectExecute {
	private int i;
	public void execute(){
		System.out.println("execute");
		//i++;
	}
	
	public void dispose(){
		System.out.println("dispose");
	}
	
	public int getI(){
		return i;
	}
}
