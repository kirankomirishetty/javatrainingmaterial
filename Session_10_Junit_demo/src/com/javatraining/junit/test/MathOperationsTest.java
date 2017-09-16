/**
 * 
 */
package com.javatraining.junit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.tests.AllTestsTest.JUnit4Test;

import junit.framework.Assert;

/**
 * @author kiran
 *
 */

@RunWith(Suite.class)
public class MathOperationsTest {

	MathOperations mathOperations = new MathOperations();
	
	@Test
	public void testAddHappyPath() {
		
		int result = mathOperations.add(10, 20);
		Assert.assertEquals(30, result);
	}

}
