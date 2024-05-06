package org.springframework.example.aop1;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class NVeryUserfulAspect {

	@Pointcut("within(org.springframework.example.aop1..*)")
	public void ptwithin() {}

	@Before("ptwithin()")
	public void withMethod() {
		log.info("NVeryUserfulAspect withMethod");
	}
}
