package com.codeboy.oj.problem;

import java.util.HashMap;
import java.util.Set;

/***
 * http://oj.leetcode.com/problems/single-number-ii/ Given an array of integers,
 * every element appears three times except for one. Find that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * @author zhaoyong
 * 
 * 
 */
public class A1_Single_Number_II {
	public int singleNumber(int[] A) {
		if (A == null) {
			throw new RuntimeException("Array is null");
		}  

		HashMap<Integer,Integer> map= new HashMap<Integer,Integer> ();
		for (int a : A) {
			if(map.get(a)==null){
				map.put(a,1) ;
			}else{
				map.put(a, map.get(a)+1) ;
			}
			
		}
		Set<Integer> set = map.keySet(); 
		for(Integer x : set){
			if(map.get(x)==1){
				return x;
			}
		}
		return 0;
	}

	public static void main(String args[]) {
		System.out.println(new A1_Single_Number_II().singleNumber(null));
	}
}

// how about more than twice, and finder a signle one ?
