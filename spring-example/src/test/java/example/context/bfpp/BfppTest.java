package example.context.bfpp;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.context.bfpp.A;
import org.springframework.example.context.bfpp.B;
import org.springframework.example.context.bfpp.F;

public class BfppTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.springframework.example.context.bfpp");
		context.addBeanFactoryPostProcessor(new B());
		context.addBeanFactoryPostProcessor(new A());
		context.addBeanFactoryPostProcessor(new F());
		context.refresh();
	}

}
