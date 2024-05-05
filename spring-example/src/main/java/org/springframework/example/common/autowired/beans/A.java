package org.springframework.example.common.autowired.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class A {
	@Autowired
	private B b;
	@javax.inject.Inject
	private C c;
	@Value("${test.port}")
	private Integer port;

	@Override
	public String toString() {
		return "A{" +
				"b=" + b +
				", c=" + c +
				", port=" + port +
				'}';
	}
}
