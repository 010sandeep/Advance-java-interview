package junit;

import junit.framework.TestSuite;

public class TestAllSuite {

	public static void main(String[] args) {

		TestSuite suite = new TestSuite("Test All");

		suite.addTestSuite(TestSuite1.class);
		suite.addTestSuite(TestSuite2.class);

		junit.textui.TestRunner.run(suite);

	}
}
