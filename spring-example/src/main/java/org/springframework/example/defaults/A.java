package org.springframework.example.defaults;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Component;

@Slf4j
@Component("aa")
public class A {

	public A() {
		log.info("default construct");
	}



	public A(C c) {
		log.info("A c");
	}

	public A(B b) {
		log.info("A B");
	}

	public A(M m) {
		log.info("A M");
	}
}
