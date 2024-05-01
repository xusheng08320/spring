package example.injecttype;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.defaults.ModelBeanFactoryPostProcessor;
import org.springframework.example.defaults.ModelConfig;

@Slf4j
public class DefaultTest {

	@Test
	public void testDefaultModel() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ModelConfig.class);
		context.register(ModelBeanFactoryPostProcessor.class);
		context.refresh();

	}
}
