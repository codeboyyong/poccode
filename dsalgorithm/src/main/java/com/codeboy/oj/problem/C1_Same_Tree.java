package com.codeboy.oj.problem;

import com.codeboy.oj.common.TreeNode;

/***
 * Given two binary trees, write a function to check if they are equal or not.
 * 
 * Two binary trees are considered equal if they are structurally identical and
 * the nodes have the same value.
 * 
 * @author zhaoyong
 * 
 */
public class C1_Same_Tree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		//check the null is very important 
		if (p == null && q == null) {
			return true;
		} else if (p != null && q != null) {
			if (p.val == q.val) {
				return isSameTree(p.left, q.left)
						&& isSameTree(p.right, q.right);
			} else {
				return false;
			}
		}else {
			return false;
		}
	}
}
