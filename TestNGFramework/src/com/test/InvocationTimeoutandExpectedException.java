package com.test;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class InvocationTimeoutandExpectedException {
	
	@Test(invocationTimeOut=2,expectedExceptions=ThreadTimeoutException.class)
	public void infiniteloop() {
		
		int i=1;
		
		while(i==1) {
			System.out.println("Value is::: "+i);
		}
	}

}
