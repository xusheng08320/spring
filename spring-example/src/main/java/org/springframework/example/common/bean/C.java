package org.springframework.example.common.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
public class C implements InitializingBean, DisposableBean {

	@PostConstruct
	public void pc() {
		log.info("c PostConstruct");
	}

	public void initMethod() {
		log.info("c initMethod");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("c afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {
		log.info("c destroy");
	}

	public void desMethod() {
		log.info("c desMethod");
	}
}
