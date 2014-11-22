package com.qiheng.junit;

import java.lang.reflect.Method;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Calculator2Test extends TestCase{
	public void testAdd() {
		
		try {
			Calculator2 cal = new Calculator2();
			Class<?> classType = cal.getClass();
			Method method = classType.getDeclaredMethod("add", new Class[] {
					int.class, int.class });
			method.setAccessible(true);
			Object obj=method.invoke(cal, new Object[]{1,2});
			Assert.assertEquals(3, (int)obj);
			
			
		} catch (Exception e) {
			Assert.fail();
		} 

	}
}
