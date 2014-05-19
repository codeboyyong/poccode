package com.codeboy.oj.problem;

/***
 * http://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * 
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * ? how about find the big sum ?
 * 
 * @author zhaoyong
 * 
 * 
 */
public class A5_Best_Time_to_Buy_and_Sell_Stock {

	// should be able to print the day of buy and sell, the return value is the
	// profit
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length < 2) {
			return 0;
		}
		int maxProfit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			// if tomorrow is down, dont count today
			if (prices[i + 1] > prices[i]) {
				int thisMax = findMax(i + 1, prices);
				if (maxProfit < thisMax - prices[i]) {
					maxProfit = thisMax - prices[i];
				}
			} 
		}
		return maxProfit;

	}
	
	

	private int findMax(int startIndex, int[] prices) {
		int max = prices[startIndex];
		for (int j = startIndex + 1; j < prices.length; j++) {
			if (max < prices[j]) {
				max = prices[j];
			}
		}
		return max;
	}
	
	//http://blog.csdn.net/linhuanmars/article/details/23162793
	public int maxProfit2(int[] prices) {  
	    if(prices==null || prices.length==0)  
	        return 0;  
	    int local = 0;  
	    int global = 0;  
	    for(int i=0;i<prices.length-1;i++)  
	    {  
	        local = Math.max(local+prices[i+1]-prices[i],0);  
	        global = Math.max(local, global);  
	    }  
	    return global;  
	}  
}
