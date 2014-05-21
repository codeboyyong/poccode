package com.codeboy.oj.problem;

import com.codeboy.oj.common.ListNode;

/***
 * https://oj.leetcode.com/problems/linked-list-cycle-ii/
 * 
 * Given a linked list, return the node where the cycle begins. If there is no
 * cycle, return null.
 * 
 * Follow up: Can you solve it without using extra space? *
 * 
 * @author zhaoyong
 * 
 */
public class B2_Linked_List_Cycle_II {
	  public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;

		ListNode meetNode = null;
		// how to evaluate the performance of this ?
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast){
				meetNode = slow;
				break;
			}
		}

		if(meetNode==null){
			return null;
		} 
		return null;
	}

}
