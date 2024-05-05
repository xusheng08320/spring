package org.springframework.example.common.imports.beans;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class C {
	public C() {
		log.info(this.getClass() + " construct");
	}
}
