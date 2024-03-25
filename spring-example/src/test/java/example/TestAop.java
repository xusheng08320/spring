package example;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.aop.A;
import org.springframework.example.aop.AppConfig;
import org.springframework.example.aop.B;

public class TestAop {
	@Test
	public void testAop() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
		A bean = ac.getBean(A.class);
		B b = bean.getB();
		b.sayHello();
	}
}
