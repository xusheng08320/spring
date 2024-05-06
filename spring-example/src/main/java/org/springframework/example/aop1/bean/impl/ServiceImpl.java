package org.springframework.example.aop1.bean.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.example.aop1.bean.Service;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServiceImpl implements Service {
	@Override
	public void method() {
		log.info(this.getClass() + "#" + "method");
	}

	@Override
	public void methodIntegerArgs(Integer i) {
		log.info(this.getClass() + "#" + "methodIntegerArgs:" + i);

	}

	@Override
	public void methodIntegerMultiArgs(Integer i, String s) {
		log.info(this.getClass() + "#" + "methodIntegerMultiArgs:" + i + s);
	}
}
