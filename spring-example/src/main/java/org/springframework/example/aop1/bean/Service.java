package org.springframework.example.aop1.bean;

public interface Service {

	void method();

	void methodIntegerArgs(Integer i);

	void methodIntegerMultiArgs(Integer i, String s);
}
