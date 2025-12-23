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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode cur, next, prev;
        cur = head;
        next = head.next;
        prev = null;

        while(next != null)
        {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }
        
        //at this point the last node was not reversed yet because next is null so we need to reverse it
        cur.next = prev;
        return cur;
    }
} 