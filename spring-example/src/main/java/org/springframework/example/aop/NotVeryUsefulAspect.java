package org.springframework.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class NotVeryUsefulAspect {

	@Pointcut("execution(* org.springframework.example.aop..B.*(..))")
	public void pointCut(){}

	@Before("pointCut()")
	public void adviceBefore() {
		log.debug("before B advice");
	}
}
