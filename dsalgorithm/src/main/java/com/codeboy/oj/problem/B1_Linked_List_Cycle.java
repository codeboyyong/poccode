package com.codeboy.oj.problem;

import com.codeboy.oj.common.ListNode;

/***
 * https://oj.leetcode.com/problems/linked-list-cycle/
 * 
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up: Can you solve it without using extra space?
 * 
 * @author zhaoyong
 * 
 */
public class B1_Linked_List_Cycle {
	//http://www.programcreek.com/2012/12/leetcode-linked-list-cycle/
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		 ListNode fast = head;
	      ListNode slow = head;
	 
	    while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
 
            if(slow == fast)
                return true;
        }
 
		return false;
	}

}
