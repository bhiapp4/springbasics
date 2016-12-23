package com.jnit.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class A {

//	@Autowired
//	private B b;
	
	@Lookup
	public B getB() {
		return null;
	}
	
//	public B getB() {
//		return b;
//	}

}
