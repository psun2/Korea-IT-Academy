package com.lec.sts11_requestparameter.logger;

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
	
	@Pointcut("execution(* com.lec.sts11_requestparameter.*.*(..))")
	public void requestParameterPc() {}
	 @Pointcut("execution(* com.lec.sts11_requestparameter.controller.*.*(..))")
	 public void memberControllerPc() {}

	
	@Around("requestParameterPc() || memberControllerPc()")
	public Object loggerAroundAdvice(ProceedingJoinPoint joinPoint) {
		
		long start = System.currentTimeMillis();
		
		Object obj = null;
		
		try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		String methodName = joinPoint.getSignature().toShortString();
		long end = System.currentTimeMillis();
		this.logger.info("{} 실행, 경과시간: {}", methodName, (end - start));
		
		return obj;
		
	}
	
}
