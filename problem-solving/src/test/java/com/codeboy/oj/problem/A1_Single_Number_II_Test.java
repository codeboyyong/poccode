package com.codeboy.oj.problem;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class A1_Single_Number_II_Test extends TestCase {

	@Test
	public void test() {
		A1_Single_Number_II singeNumberFinder = new A1_Single_Number_II();

		Assert.assertEquals(singeNumberFinder.singleNumber(new int[] { 1, 2, 2, 2,1,1, 4 }), 4);
		try{
			singeNumberFinder.singleNumber(null);
		}catch(RuntimeException e){
			
		}
	 
		Assert.assertEquals(singeNumberFinder.singleNumber(new int[] { 1, 1, 1,0 }), 0);
 

	}

}
