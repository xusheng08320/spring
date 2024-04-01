package org.springframework.example.injecttype;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class A {

	public A() {
	}

	public A(B c) {
		log.info("a  inject b " + c);
	}

	public void setC(B c) {
		log.info("注入B 对象" + c);
	}

}
