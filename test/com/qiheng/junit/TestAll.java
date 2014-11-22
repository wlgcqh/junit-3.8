package com.qiheng.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestAll extends TestCase {
	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(Array1Test.class);
		suite.addTestSuite(Calculator2Test.class);
		suite.addTestSuite(CalculatorTest.class);
		return suite;
	}
}