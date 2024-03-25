package org.springframework.example.aop;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Slf4j
@Component
public class B {

	@Autowired
	private C c;

	public void sayHello() {
		log.debug("hello");
	}
}
