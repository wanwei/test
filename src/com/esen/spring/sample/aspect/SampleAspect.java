package com.esen.spring.sample.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SampleAspect {	
	//@Before("execution(* com.esen.spring.sample.aspect..*.*(..))")
	//@Before("within(com.esen.spring.sample.aspect..*)")
	@Before("execution(* com.esen.spring.sample.aspect.*.*(..))")
	public void doBeforeInServiceLayer() {
		System.out.println("=====================================");
		System.out.println("Aop: do before in execute");
		System.out.println("=====================================");
	}
//	@Pointcut("execution(* transfer(..))")// the pointcut expression
//	private void anyOldTransfer() {}// the pointcut signature
}
