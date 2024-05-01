package example.dependsOn;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

	@Test
	public void testDependsOn() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.springframework.example.depnedsOn");
		context.refresh();
	}
}
