package com.jnit.tightycoupled;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=DefaultListableBeanFactory.SCOPE_PROTOTYPE)//("prototype)
public class ShapeCreator {

	public void createAndTest(){
		System.out.println("Creating and testing");
	}
}
