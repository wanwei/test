package com.esen.spring.sample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.esen.spring.sample.button.Button;

import junit.framework.TestCase;

public class SpringTest extends TestCase {

	private ApplicationContext ctx;

	public void setUp() {
		ctx = new ClassPathXmlApplicationContext(new String[] { "springtest.xml" });
	}

	public void testAnalyse() {
		Analyse ana = ctx.getBean("analyse", Analyse.class);
		assertEquals("true", ana.getResult("ww"));
		assertEquals("false", ana.getResult("wanwei"));
		assertNull(ana.getResult("me"));
	}
}
