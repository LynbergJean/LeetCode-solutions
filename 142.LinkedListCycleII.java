/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;

        //UPI 
        //input a linked list not sorted
        ListNode slow = head;
        ListNode fast = head;
        boolean found = false;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                found = true;
                break;
            }
        }

        if(!found)
        {
            return null;
        }

        fast = head;
        while(slow != null)
        {
            if(slow == fast)
            {
                return slow;
            }
            fast = fast.next;
            slow = slow.next;

            
        }
        return null;
    }
}