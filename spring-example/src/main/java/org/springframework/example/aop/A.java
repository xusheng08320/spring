package org.springframework.example.aop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Data
@Component
public class A {

	@Autowired
	private B b;


}
