package org.springframework.example.statics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class A {

	public A() {
		log.info("default constructor");
	}
	public A(String s) {
		log.info("string constructor");
	}

	public A(int i) {
		log.info("int constructor");
	}

	public A(float f) {
		log.info("float constructor");
	}

}
