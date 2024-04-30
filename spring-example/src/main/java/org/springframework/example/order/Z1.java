package org.springframework.example.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Order(5)
@Component("1")
public class Z1 {

	public Z1() {
		log.info("order - {}", this.getClass().getAnnotation(Order.class).value());
	}
}
