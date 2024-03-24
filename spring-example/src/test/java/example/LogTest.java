package example;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class LogTest {

	@Test
	public void testRefresh() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register();
	}
}
