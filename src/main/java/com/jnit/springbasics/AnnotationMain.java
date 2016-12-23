package com.jnit.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Beans.class);
		Triangle t = ac.getBean(Triangle.class);
		t.drawShape();
		((AnnotationConfigApplicationContext)ac).close();

	}

}
