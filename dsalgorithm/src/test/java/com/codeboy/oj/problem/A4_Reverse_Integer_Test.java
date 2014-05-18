package com.codeboy.oj.problem;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class A4_Reverse_Integer_Test extends TestCase {

	@Test
	public void test() {
		A4_Reverse_Integer intReverser = new A4_Reverse_Integer();

		Assert.assertEquals(intReverser.reverse(1) , 1);
		Assert.assertEquals(intReverser.reverse(-1) , -1);
		Assert.assertEquals(intReverser.reverse(0) , 0);
		
		Assert.assertEquals(intReverser.reverse(321) , 123);
		Assert.assertEquals(intReverser.reverse(123) , 321);

		Assert.assertEquals(intReverser.reverse(-321) , -123);
		Assert.assertEquals(intReverser.reverse(-123) , -321);

		Assert.assertEquals(intReverser.reverse(123456789) , 987654321);

	}

}
