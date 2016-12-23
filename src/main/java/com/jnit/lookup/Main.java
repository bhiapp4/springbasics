package com.jnit.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jnit.javaconfig.ShapeConfiguration;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ShapeConfiguration.class);
		A a = ac.getBean(A.class);
		B b = a.getB();
		b.x = "hello";
		B b1 = a.getB();
		System.out.println(b.x);
		System.out.println(b1.x);
		((AnnotationConfigApplicationContext)ac).close();
	}

}
