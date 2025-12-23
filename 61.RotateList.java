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
    public ListNode rotateRight(ListNode head, int k) {
        //find lenght mod it and rotate from there
        if(head == null || head.next == null) return head;

        //no rotation needs to be done
        if(k == 0)
        {
            return head;
        }

        //find the length of the list
        int length = 0;
        ListNode temp = head;

        while(temp != null)
        {
            length++;
            temp = temp.next;
        }

        //find how much to rotate by 
        int rotation = k % length;
        if(rotation == 0)
        {
            return head;
        }

        //else 
        ListNode iterator = head;
        ListNode newHead = iterator.next;

        int l = 0;
        while(l != (length - rotation - 1))
        {
            l++;
            iterator = iterator.next;
            newHead = iterator.next;
        }
        
        //find the last node 
        ListNode last = head;
        while(last.next != null)
        {
            last = last.next;
        }

        last.next = head;
        //create new ending point for linked list
        iterator.next = null;



        return newHead;
    }
}