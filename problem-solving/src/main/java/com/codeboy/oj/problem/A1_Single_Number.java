package com.codeboy.oj.problem;

/**
 * http://oj.leetcode.com/problems/single-number/
 * 
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * */
public class A1_Single_Number {
	public  int singleNumber(int[] A) {
		if(A==null){
			throw new RuntimeException ("Array is null");
		}
		else if(A.length%2 ==0){
			throw new RuntimeException ("Array must have odd elements");
		}
		 
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}

	public static void main(String args[]) {
		System.out.println(new A1_Single_Number().singleNumber(null));
	}
}

//how about more than twice, and finder a signle one ? 
