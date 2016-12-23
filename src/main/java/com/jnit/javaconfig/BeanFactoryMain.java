package com.jnit.javaconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.jnit.springbasics.Shape;
import com.jnit.springbasics.Triangle;

public class BeanFactoryMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
		Shape s =  beanFactory.getBean(Triangle.class);
		s.drawShape();	
	}

}
