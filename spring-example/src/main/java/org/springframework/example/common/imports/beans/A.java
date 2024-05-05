package org.springframework.example.common.imports.beans;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class A {
	public A() {
		log.info(this.getClass() + " construct");
	}
}
