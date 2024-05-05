package org.springframework.example.common.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class B {
	@Bean(initMethod = "initMethod", destroyMethod = "desMethod")
	public C getC() {
		return new C();
	}
}
