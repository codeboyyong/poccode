package com.codeboy.oj.problem;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class Largest_Rectangle_in_Histogram_Test extends TestCase {

	@Test
	public void test() {
		A8_Largest_Rectangle_in_Histogram alg= new A8_Largest_Rectangle_in_Histogram();
		Assert.assertEquals(alg.largestRectangleArea(new int[]{0,9}),9);
		Assert.assertEquals(alg.largestRectangleArea(new int[]{ 2,1,2}),3);
		Assert.assertEquals(alg.largestRectangleArea(new int[]{ 1,2,2}),4);
		
	}

}
