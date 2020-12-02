package com.lec.spring.aop02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.lec.spring.beans.Logger;

// 이 클래스가 Aspect 역할을 할 클래스임을 명시
@Aspect
public class LogAspect {
	
	@Pointcut("within(com.lec.spring.aop02.*)")
	public void pc1() {}
	
	@Pointcut("within(com.lec.spring.aop02.*)")
	public void pc2() {}
	

	//@Before("within(com.lec.spring.aop02.*)")
	@Before("pc1()")
	public void beforeAdvice() {
		System.out.print("[Before] ");
		new Logger().logIn();
	}
	
	
	//@After("within(com.lec.spring.aop02.*)")
	//@After("execution(* com.lec.spring.aop02.MyService22.*(..))")
	@After("pc2()")
	public void afterAdvice() {
		System.out.printf("[After] ");
		new Logger().logOut();
	}
	
	// Around advice
	// 직접 target 메소드(JoinPoint) 를 호출하고 결과나 예외 처리 가능!
	@Around("within(com.lec.spring.aop02.*)")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		// joinPoint 메소드 이름
		String signatureStr = joinPoint.getSignature().toShortString();
		
		// joinPoint 메소드 수행전
		System.out.println("[Around] " + signatureStr + " 시작");
		long st = System.currentTimeMillis();  
		
		try {			
			// joinPoint 메소드 수행.
			Object obj = joinPoint.proceed();   
			return obj;
		} finally {
			// joinPoint 메소드 수행후 
			long et = System.currentTimeMillis();
			System.out.println("[Around] " + signatureStr + " 종료, 경과시간 : " + (et - st));
		}
		
		
		
	}
	
	
	
	
	
}











