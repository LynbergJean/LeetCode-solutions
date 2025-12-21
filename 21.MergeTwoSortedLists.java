/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //UPI 
        /* 
        Understand
        okay we have 2 sorted linked list
        input: both list can be empty, they are sorted, they can have repeating elements 
        output: 1 list that merges both lists
        edge cases: if one list is empty then return the other.

        Plan: 
        check both edge cases
        do we need to create a new list altogether?
        yes lets do that create a new list altogether and add the nodes in the list sorted

        */

        ListNode newHead = new ListNode();
        ListNode tempHead = newHead;

        while(list1 != null && list2 != null)
        {
            if(list1.val < list2.val)
            {
                ListNode temp = new ListNode(list1.val);
                newHead.next = temp;
                newHead = temp;
                list1 = list1.next;
            }else{
                ListNode temp = new ListNode(list2.val);
                newHead.next = temp;
                newHead = temp;
                list2 = list2.next;
            }
        }

        if(list1 != null)
        {
            newHead.next = list1;
        }

        if(list2 != null)
        {
            newHead.next = list2;
        }

        return tempHead.next;
    }
}