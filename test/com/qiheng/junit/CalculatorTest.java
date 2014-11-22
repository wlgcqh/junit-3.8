package com.qiheng.junit;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author acer
 * 
 */

public class CalculatorTest extends TestCase {
	private Calculator cal;

	@Override
	protected void setUp() throws Exception {
		cal=new Calculator();
	}

	@Override
	protected void tearDown() throws Exception {
	}

	public void testAdd() {
		int result = cal.add(1, 2);
		Assert.assertEquals(3, result);
	}

	public void testSub() {
		int result = cal.sub(1, 2);
		Assert.assertEquals(-1, result);
	}

}
