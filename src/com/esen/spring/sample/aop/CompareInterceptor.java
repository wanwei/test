package com.esen.spring.sample.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CompareInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result = null;
		String stu_name = invocation.getArguments()[0].toString();
		if (stu_name.equals("ww")) {
			//invocation.getArguments()
			//如果学生是dragon时,执行目标方法,
			result = invocation.proceed();
		}
		else {
			System.out.println("只有ww能加入，" + stu_name + "不能加入.");
		}
		return result;
	}

}
