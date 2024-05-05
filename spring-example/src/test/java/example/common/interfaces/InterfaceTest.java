package example.common.interfaces;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.common.interfaces.A;
import org.springframework.example.common.interfaces.I;

public class InterfaceTest {

	@Test
	public void testInterface() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(A.class);
		context.refresh();
		I bean = context.getBean(I.class);
		A a = context.getBean(A.class);
		System.out.println(bean);
		System.out.println(a);
	}
}
