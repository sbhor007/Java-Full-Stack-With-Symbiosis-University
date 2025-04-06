package com.trg.AOP;

import org.aspectj.lang.JoinPoint;

public class MyAfterAspect {
	public void myAdvise(JoinPoint jp) {
		System.out.println("After the Method " + jp.getSignature().getName() + " Complets the Exicution");
	}
}
