package com.codeboy.oj.problem;

import java.util.Deque;
import java.util.LinkedList;

/***
 * https://oj.leetcode.com/problems/largest-rectangle-in-histogram/
 * 
 * Given n non-negative integers representing the histogram's bar height where
 * the width of each bar is 1, find the area of largest rectangle in the
 * histogram.
 * 
 * 
 * Above is a histogram where width of each bar is 1, given height =
 * [2,1,5,6,2,3].
 * 
 * 
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 * 
 * For example, Given height = [2,1,5,6,2,3], return 10.
 * 
 * @author zhaoyong
 * @see http://www.darrensunny.me/leetcode-largest-rectangle-in-histogram/
 */
public class A8_Largest_Rectangle_in_Histogram {

	int largestRectangleArea(int[] height) {
		
		if (height == null || height.length == 0)
            return 0;
        int n = height.length;
        int largestArea = 0;
        Deque<Integer> indexStack = new LinkedList<Integer>();
 
        // For each bar, pop out the bars higher than it and calculate the largest area of
        // the rectangle using this full bar, before pushing it to the stack
        for (int i = 0; i < n; i++) {
            while (!indexStack.isEmpty() && height[i] <= height[indexStack.peek()]) {
                int index = indexStack.pop();
                if (indexStack.isEmpty())
                    largestArea = Math.max(largestArea, i*height[index]);
                else
                    largestArea = Math.max(largestArea, (i-indexStack.peek()-1)*height[index]);
            }
            indexStack.push(i);
        }
 
        // Calculate the largest area of the rectangle using each full bar remaining in the stack
        while (!indexStack.isEmpty()) {
            int index = indexStack.pop();
            if (indexStack.isEmpty())
                largestArea = Math.max(largestArea, n*height[index]);
            else
                largestArea = Math.max(largestArea, (n-indexStack.peek()-1)*height[index]);
        }
 
        return largestArea;
//		if(height.length==0){
//			return 0;
//		}
//		int maxTotal = height[0];
//		int maxHeight =height[0];
//		int n = 1;
//		int tempTotal =height[0];
//		for(int i =1;i<height.length;i++){
//		 	if(height[i]==0){
//				n=1;
//				i=i+1;
//				if(i<height.length){
//					tempTotal=height[i];
//				}
//				i=i+1;
//			}
//			else if(height[i]<=maxHeight){
//				if(tempTotal<=height[i]*(n+1)){
//					maxHeight=height[i];
//					n = n+1;
//					tempTotal = maxHeight*(n);
//				}else{
//					n=1;
//					tempTotal=height[i];
//				} 
//			 }else{
//				 n=n+1;
//				 if(maxHeight==0){
//					 tempTotal = height[i];
//				 }else{
//					 tempTotal = maxHeight*n;
//				 }
//			 }
//			 
//			 if(tempTotal>maxTotal){
//				 maxTotal = tempTotal;
//			 }
//			
//		}
//		
//		return maxTotal;

	}
 
}
