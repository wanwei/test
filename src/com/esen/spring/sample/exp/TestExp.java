package com.esen.spring.sample.exp;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestExp {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		String str1 = "'Hello World'.concat('!')";
		//String str2 = "execution(*)";
		Expression exp = parser.parseExpression(str1);
		String message = (String) exp.getValue();
		System.out.println(message);		
	}
}
