package com.codeboy.oj.problem;

/***
 * http://oj.leetcode.com/problems/reverse-integer/
 * 
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321 Example2: x = -123, return -321
 * 
 * click to show spoilers. Have you thought about this?
 * 
 * Here are some good questions to ask before coding. Bonus points for you if
 * you have already thought through this!
 * 
 * If the integer's last digit is 0, what should the output be? ie, cases such
 * as 10, 100.
 * 
 * Did you notice that the reversed integer might overflow? Assume the input is
 * a 32-bit integer, then the reverse of 1000000003 overflows. How should you
 * handle such cases?
 * 
 * Throw an exception? Good, but what if throwing an exception is not an option?
 * You would then have to re-design the function (ie, add an extra parameter).
 * 
 * @author zhaoyong
 * 
 */
public class A4_Reverse_Integer {

	public int reverse(int x) {
		int newN = 0, left = 0;
		while (x != 0) {
			left = x % 10;
			newN = newN * 10 + left;
			x = x / 10;
		}
		return newN;
	}
}
