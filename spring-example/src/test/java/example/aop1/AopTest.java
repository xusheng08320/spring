package example.aop1;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.aop1.AppConfig;
import org.springframework.example.aop1.bean.Service;

public class AopTest {

	@Test
	public void testAop() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		Service service = context.getBean(Service.class);
		service.method();
	}
}
