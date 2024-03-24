package example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.MyBean;

public class LogTest {

	@Test
	public void testRefresh() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(MyBean.class);
		ac.refresh();
		MyBean bean = ac.getBean(MyBean.class);
		int id = bean.getId();
	}
}
