package example.order;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

public class OrderModeTest {

	@Test
	public void testOrderModel() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.springframework.example.order");
		context.refresh();
	}
}
