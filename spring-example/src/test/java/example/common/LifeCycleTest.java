package example.common;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

	@Test
	public void testLifeCycle() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.springframework.example.common.bean");
		context.refresh();
		context.close();
	}
}
