package org.springframework.example.depnedsOn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("da")
@Slf4j
@DependsOn("db")
public class DA {

	static {
		log.info("a static");
	}

	@PostConstruct
	public void initMethod() {
		log.info("DA initMethod");
	}
}
