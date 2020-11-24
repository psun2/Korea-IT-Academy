package com.lec.sts10_request.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Aspect
public class LoggerAspect {

	@Autowired
	@Qualifier("logger")
	private Logger logger;

	// @Pointcut("execution(* com.lec.sts10_request.controller.BoardController.*(..))")
	@Pointcut("execution(* com.lec.sts10_request.*.*(..))")
	// @Pointcut("within(com.lec.sts10_request.*)")
	public void requestPc() {
	}
	
	@Pointcut("execution(* com.lec.sts10_request.controller.*.*(..))")
	public void controllerPc() {
	}

	@Around("requestPc() || controllerPc()")
	public Object loogerAroundAdvice(ProceedingJoinPoint joinPoint) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.register(LoggerConfig.class);
//		ctx.refresh();
//
//		Logger logger = ctx.getBean("logger", Logger.class);
		long start = System.currentTimeMillis();
		String methodName = joinPoint.getSignature().toShortString();
		this.logger.info("{} 실행", methodName);

		Object obj = null;
		try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		ctx.close();
		long end = System.currentTimeMillis();
		this.logger.info("{} 실행, 경과시간: {}", methodName, (end - start));
		return obj;
	}

//	@Before("loggerPc()")
//	public void loogerBeforeAdvice() {
////		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
////		ctx.register(LoggerConfig.class);
////		ctx.refresh();
//
////		Logger logger = ctx.getBean("logger", Logger.class);
//
////		ctx.close();
//
//		this.logger.info("{} 실행");
//	}

}
