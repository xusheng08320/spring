package org.springframework.example.aop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class C {

	@Autowired
	private B b;
}
