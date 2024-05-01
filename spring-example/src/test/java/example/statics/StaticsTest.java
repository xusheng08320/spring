package example.statics;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.statics.A;
import org.springframework.example.statics.ObjectFactory;
import org.springframework.example.statics.SupplierFactory;

public class StaticsTest {

	@Test
	public void testStatics() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ObjectFactory.class);
		GenericBeanDefinition bd = new GenericBeanDefinition();
		bd.setBeanClass(A.class);
		bd.setFactoryBeanName("objectFactory");
		bd.setFactoryMethodName("instanceObject");
		context.registerBeanDefinition("a", bd);
		context.refresh();
	}

	@Test
	public void testStaticsSupplier() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		GenericBeanDefinition bd = new GenericBeanDefinition();
		bd.setBeanClass(A.class);
		SupplierFactory supplierFactory = new SupplierFactory();
		bd.setInstanceSupplier(supplierFactory::instanceObject);
		context.registerBeanDefinition("a", bd);
		context.refresh();
	}
}
