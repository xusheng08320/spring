package org.springframework.example.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Order(6)
@Component("3")
public class Z3 {

	public Z3() {
		log.info("order - {}", this.getClass().getAnnotation(Order.class).value());
	}
}
