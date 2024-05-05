package example.common.autowired;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.common.autowired.beans.A;

@Slf4j
public class AutowiredTest {

	@Test
	public void testAutowired() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.springframework.example.common.autowired.beans");
		context.refresh();
		A bean = context.getBean(A.class);
		log.info(bean.toString());
	}
}
