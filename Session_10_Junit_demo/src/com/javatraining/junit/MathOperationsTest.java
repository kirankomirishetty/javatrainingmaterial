package com.javatraining.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javatraining.junit.test.MathEnum;
import com.javatraining.junit.test.MathOperations;

import junit.framework.Assert;

public class MathOperationsTest {

	MathOperations mathOperations = new MathOperations();

	
	@Test
	public void testAdd() {
		int result = mathOperations.add(10, 20);
		Assert.assertEquals(31, result);
	}

	@Test
	public void testSub() {
		int result = mathOperations.sub(10, 20);
		Assert.assertEquals(-10, result);
	}

	@Test
	public void testMul() {
		int result = mathOperations.mul(10, 20);
		Assert.assertEquals(200, result);
	}

	@Test
	public void testDiv() {
		int result = mathOperations.div(10, 20);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void testPerformOperationAdd() {
		double result = mathOperations.performOperation(10, 20, MathEnum.ADD);
		Assert.assertEquals(30d,result);
		
	}
	@Test
	public void testPerformOperationSub() {
		double result = mathOperations.performOperation(10, 20, MathEnum.SUB);
		Assert.assertEquals(-10d,result);
		
	}
	@Test
	public void testPerformOperationDiv() {
		double result = mathOperations.performOperation(10, 20, MathEnum.DIV);
		Assert.assertEquals(2d,result);
		
	}
	@Test
	public void testPerformOperationMul() {
		double result = mathOperations.performOperation(10, 20, MathEnum.MUL);
		Assert.assertEquals(200d,result);
		
	}
	@Test
	public void testPerformOperationInvlaid() {
		double result = mathOperations.performOperation(10, 20, MathEnum.INVALID);
		Assert.assertEquals(-1d,result);
		
	}

}
