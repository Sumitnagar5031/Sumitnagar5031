package org.automation.stepdefination;

import io.cucumber.java.Before;

public class Hook {

	
	
	@Before("@UpdateUser")
	public void RuninHookMethod() {
		
		System.out.println("RUN THIS IN HOOK CLASS");
	}
	
	
}
