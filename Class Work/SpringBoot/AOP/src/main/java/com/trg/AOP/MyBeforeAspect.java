package com.trg.AOP;

import org.aspectj.lang.JoinPoint;

public class MyBeforeAspect {
	public void myAdvise(JoinPoint jp) {
		System.out.println("Begore the method " + jp.getSignature().getName() + " Started the Exicution");
	}
}
