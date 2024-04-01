package example.injecttype;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.injecttype.A;

public class InjectTypeTest {

	@Test
	public void testApp1() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("org.springframework.example.injecttype");
		A a = ac.getBean(A.class);
		System.out.println(a);
	}
}
