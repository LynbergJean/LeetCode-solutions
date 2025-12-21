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
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;

        //UPI

        //Input given a linked list not sorted
        //output boolean if there is cycle true false otherwise
        //edge cases: we can have an empty linkedlist so we need to take care of that

        //Plan: were going to use the tortoise Hare algorithm known as floyds alsogorthm where we will hae a fast pointer and a show pointer and eventually if they meet then we have a cycle

        if(head == null) //meaning an empty linked list 
        {
            return false;
        }


        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) //the 2 pointers have met up to return true
            {
                return true;
            }
        }

        //if the loop breaks then we've found a null pointer which signifies the end of a linked list so return false
        return false;
    }
}