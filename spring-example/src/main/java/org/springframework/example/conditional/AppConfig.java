package org.springframework.example.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Conditional(AConditional.class)
	@Bean
	public A a() {
		return new A();
	}

}
