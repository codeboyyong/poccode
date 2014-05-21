package com.codeboy.oj.problem;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class A7_Roman_to_Integer_Test extends TestCase {

	@Test
	public void test() {
		A7_Roman_to_Integer romantonteger = new A7_Roman_to_Integer();

		Assert.assertEquals(romantonteger.romanToInt("I"), 1);
		Assert.assertEquals(romantonteger.romanToInt("II"), 2);
		Assert.assertEquals(romantonteger.romanToInt("III"), 3);
		Assert.assertEquals(romantonteger.romanToInt("IV"), 4);
		Assert.assertEquals(romantonteger.romanToInt("V"), 5);
		Assert.assertEquals(romantonteger.romanToInt("VI"), 6);
		Assert.assertEquals(romantonteger.romanToInt("VII"), 7);
		Assert.assertEquals(romantonteger.romanToInt("VIII"), 8);
		Assert.assertEquals(romantonteger.romanToInt("IX"), 9);
		Assert.assertEquals(romantonteger.romanToInt("X"), 10);
		Assert.assertEquals(romantonteger.romanToInt("XI"), 11);
		Assert.assertEquals(romantonteger.romanToInt("XXIII"), 23);
		
 
		
	}

}
