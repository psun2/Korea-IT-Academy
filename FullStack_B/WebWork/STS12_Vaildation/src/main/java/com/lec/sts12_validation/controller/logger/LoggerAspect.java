package com.lec.sts12_validation.controller.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Aspect
public class LoggerAspect {

	@Autowired
	@Qualifier("logger")
	private Logger logger;
	
	@Pointcut("execution(* com.lec.sts12_validation.*.*(..))")
	public void controllerPc() {}
	
	@Around("controllerPc()")
	public Object controllerAroundAdvice(ProceedingJoinPoint joinPoint) {
		
		Object obj = null;
		
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		String methodName = joinPoint.getSignature().toShortString();
		logger.info("{} 실행, 경과시간: {}", methodName, (end - start));
		return obj;
	}
	
}
