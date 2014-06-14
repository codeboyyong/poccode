package com.codeboy.oj.problem;

/***
 * http://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/ Say you
 * have an array for which the ith element is the price of a given stock on day
 * i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (ie, buy one and sell one share of the stock
 * multiple times). However, you may not engage in multiple transactions at the
 * same time (ie, you must sell the stock before you buy again).
 * 
 * ? how about find the big sum ?
 * 
 * @author zhaoyong
 * 
 * 
 */
public class A6_Best_Time_to_Buy_and_Sell_Stock_II {

	// should be able to print the day of buy and sell, the return value is the
	// profit
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length < 2) {
			return 0;
		}
		int maxProfit = 0;

		for (int i = 0; i < prices.length - 1; i++) {
			if(prices[i+1]>prices[i]){
				maxProfit=maxProfit+prices[i+1] -prices[i];
			}
		}
		return maxProfit;

	}

}
