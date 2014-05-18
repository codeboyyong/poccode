package com.codeboy.oj.problem;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class A1_Single_Number_Test extends TestCase {

	@Test
	public void test() {
		A1_Single_Number singeNumberFinder = new A1_Single_Number();

		Assert.assertEquals(singeNumberFinder.singleNumber(new int[] { 1, 2, 3,1, 2, 3, 4 }), 4);
		try{
			singeNumberFinder.singleNumber(null);
		}catch(RuntimeException e){
			
		}
		try{
			singeNumberFinder.singleNumber(new int[]{1,1,2,2});
		}catch(RuntimeException e){
			
		}
		Assert.assertEquals(singeNumberFinder.singleNumber(new int[] { 1, 1, 0 }), 0);
		// Assert.assertEquals(singeNumberFinder.singleNumber(new int[]{1,1,2,2
		// }),0); -- this is not correct

	}

}
