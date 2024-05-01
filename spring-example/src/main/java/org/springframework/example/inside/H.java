package org.springframework.example.inside;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class H {

	class J {

	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(J.class);
		ac.refresh();
		System.out.println(ac.getBean(J.class));
	}

}
