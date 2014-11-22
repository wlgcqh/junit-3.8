package com.qiheng.junit;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MyStackTest extends TestCase {
	private MyStack stack;
	private int count;
	@Override
	public void setUp() throws Exception {
		
		stack = new MyStack();
		System.out.println(stack);
	}

	public void testPush() {
		Throwable th = null;
		try {
			for (int i = 0; i < 100; i++) {
				stack.push(i + "");
			}

		} catch (Exception e) {
			th = e;
			Assert.fail("push failed");
		}

	}

	public void testPush1() {
		Throwable th = null;
		try {
			for (int i = 0; i <= 100; i++) {
				stack.push(i + "");

			}
			Assert.fail("push failed");

		} catch (Exception e) {
			th = e;

		}
		assertData(th);

	}

	public void testPop() {
		String str = null;
		try {
			stack.push("1");
			str = stack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail("push failed");
			e.printStackTrace();
		}
		Assert.assertEquals("1", str);

	}

	public void testPop1() {
		String str = null;
		Throwable th = null;
		try {

			str = stack.pop();
			Assert.fail("push failed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			th = e;
		}
		assertData(th);

	}

	private void assertData(Throwable th) {
		Assert.assertEquals(Exception.class, th.getClass());
		Assert.assertEquals("数组越界异常！", th.getMessage());
	}

	public void testDelete() {
		Throwable th = null;
		try {
			for (int i = 0; i < 10; i++) {
				stack.push(i + "");

			}
			stack.delete(10);

		} catch (Exception e) {
			Assert.fail("push failed");
			th = e;

		}
		Assert.assertEquals(0, stack.getIndex());
	}

	public void testDelete1() {
		Throwable th = null;
		try {
			for (int i = 0; i < 10; i++) {
				stack.push(i + "");

			}
			stack.delete(11);
			Assert.fail("push failed");

		} catch (Exception e) {

			th = e;

		}
		assertData(th);
	}

	public void testTop() {
		String str = null;
		try {
			stack.push("1abc");
			str = stack.top();
		} catch (Exception e) {
			Assert.fail("push failed");
		}
		Assert.assertEquals("1abc", str);
	}

	public void testTop1() {
		Throwable th = null;
		String str = null;
		try {

			str = stack.top();
			Assert.fail("push failed");
		} catch (Exception e) {
			th = e;
		}
		assertData(th);
	}
}
