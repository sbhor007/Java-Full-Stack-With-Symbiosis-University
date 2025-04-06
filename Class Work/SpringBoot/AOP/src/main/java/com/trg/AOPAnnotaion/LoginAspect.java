package com.trg.AOPAnnotaion;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAspect {
	@Before("execution(* com.trg.AOPAnnotaion.*.*(..))")
	public void beforeExicution(JoinPoint jp) {
		System.out.println("Before Exicuting Method " + jp.getSignature().getName() + "");
	}
	@After("execution(* com.trg.AOPAnnotaion.*.*(..))")
	public void afterExicution(JoinPoint jp) {
		System.out.println("After Exicuting Method " + jp.getSignature().getName() + "");
	}
	
	
}
