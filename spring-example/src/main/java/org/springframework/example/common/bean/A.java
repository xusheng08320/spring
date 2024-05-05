package org.springframework.example.common.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class A {
	@Autowired
	private B b;

	@Resource
	private C c;
}
