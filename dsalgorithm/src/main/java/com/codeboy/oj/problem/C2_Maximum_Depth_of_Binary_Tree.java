package com.codeboy.oj.problem;

import com.codeboy.oj.common.TreeNode;

/***
 * 
 * http://oj.leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the root
 * node down to the farthest leaf node.
 * 
 * @author zhaoyong
 * 
 */
public class C2_Maximum_Depth_of_Binary_Tree {

    public int maxDepth(TreeNode root) {
    	if(root==null){
    		return 0;
    	}else{
    		//1 is the unit value
    		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
