package example.conditional;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.conditional.A;
import org.springframework.example.conditional.AppConfig;
import org.springframework.util.SocketUtils;

public class ConditionalTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		A bean = context.getBean(A.class);
		System.out.println(bean);
	}
}
