package org.springframework.example.depnedsOn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("db")
@Slf4j
public class DB {
	static {
		log.info("static DB");
	}

	@PostConstruct
	public void initMethod() {
		log.info("DB initMethod");
	}
}
