package com.qiheng.junit;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Array1Test extends TestCase {
	private Array1 array;

	@Override
	public void setUp() throws Exception {
		array = new Array1();
	}

	public void testGetLargest() {
		int[] a = { 1, 5, 3, 8, 2 };
		int result = 0;
		try {
			result = array.getLargest(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail("failed");
		}
		Assert.assertEquals(8, result);
	}

	public void testGetLargest2() {
		Throwable th = null;
		int[] a = null;
		int result = 0;
		try {
			result = array.getLargest(a);
			Assert.fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			th = e;
		}
		Assert.assertEquals(Exception.class, th.getClass());
		Assert.assertEquals("Could not be null", th.getMessage());
	}

	public void testGetLargest3() {
		Throwable th = null;
		int[] a = {};
		// System.out.println(a.length);
		int result = 0;
		try {
			result = array.getLargest(a);
			Assert.fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			th = e;
		}
		Assert.assertEquals(Exception.class, th.getClass());
		Assert.assertEquals("Could not be null", th.getMessage());
	}
	public static void main(String[] args) {
		junit.textui.TestRunner.run(Array1Test.class);
	}
}
