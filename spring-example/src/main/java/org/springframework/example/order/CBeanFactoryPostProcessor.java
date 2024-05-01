package org.springframework.example.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Order(7)
@Component
public class CBeanFactoryPostProcessor extends E implements BeanFactoryPostProcessor, InitializingBean {
	public CBeanFactoryPostProcessor() {
		log.info("== construct bean c");
	}

	@PostConstruct
	public void initMethod() {
		log.info("annotation init bean c");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		int orderValue = 0;
		if (this.getClass().isAnnotationPresent(Order.class)) {
			Order order = this.getClass().getAnnotation(Order.class);
			orderValue = order.value();
		}
		log.info("execute postProcessBeanFactory c order = {}", orderValue);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("InitializingBean c afterPropertiesSet ");

	}
}
