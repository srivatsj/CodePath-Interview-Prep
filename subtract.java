/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode subtract(ListNode a) {
	    
	    if(a == null) return a;
	    
	    ListNode head = a;
	    ListNode slow = a;
	    ListNode fast = a;
	    ListNode prev = null;
	    
	    while(fast != null && fast.next != null)
	    {
	        prev = slow;
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    
	    ListNode head2 = null;
	    ListNode middle = null;
	    
	    if(fast == null) {
	        head2 = slow;
	        prev.next = null;
	        middle = prev;
	    }
	    else {
	        head2 = slow.next;
	        slow.next = null;
	        middle = slow;
	    }
	    
	    ListNode revHead = reverse(head2);
	    head2 = revHead;
	    
	    while(head2 != null) {
	       head.val = head2.val - head.val;
	       head = head.next;
	       head2 = head2.next;
	    }
	    
	    head2 = reverse(revHead);
	    middle.next = head2;
	    return a;
	}
	
	public ListNode reverse(ListNode h) {
	    
	    ListNode n = h;
	    ListNode tmp = null;
	    ListNode prev = null;
	    
	    while(n != null)
	    {
	        tmp = n.next;
	        n.next = prev;
	        prev = n;
	        n = tmp;
	    }
	    
	    return prev;
	}
}
