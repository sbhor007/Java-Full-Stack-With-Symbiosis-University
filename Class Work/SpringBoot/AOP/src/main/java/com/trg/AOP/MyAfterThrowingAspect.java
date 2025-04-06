package com.trg.AOP;

import org.aspectj.lang.JoinPoint;

public class MyAfterThrowingAspect {
	public void myAdvise(JoinPoint jp) {
		System.out.println("After the method " + jp.getSignature().getName() + " It Throws An Exception");
	}
}
