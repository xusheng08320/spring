package org.springframework.example.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Order(5)
@Component
public class BBeanFactoryPostProcessor extends E implements BeanFactoryPostProcessor {
	public BBeanFactoryPostProcessor() {
		log.info("== construct bean b");
	}

	@PostConstruct
	public void initMethod() {
		log.info("annotation init bean b");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		int orderValue = 0;
		if (this.getClass().isAnnotationPresent(Order.class)) {
			Order order = this.getClass().getAnnotation(Order.class);
			orderValue = order.value();
		}
		log.info("execute postProcessBeanFactory b order = {}", orderValue);
	}
}
