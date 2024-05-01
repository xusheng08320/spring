package org.springframework.example.lookup;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LA {

	@Autowired
	LB lb;

	public void printInfo() {
		log.info("lb-[{}]", lb);
		log.info("lb-[{}]", lb);
	}
}
