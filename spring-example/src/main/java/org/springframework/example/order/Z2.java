package org.springframework.example.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Order(4)
@Component("2")
public class Z2 {

	public Z2() {
		log.info("order - {}", this.getClass().getAnnotation(Order.class).value());
	}
}
