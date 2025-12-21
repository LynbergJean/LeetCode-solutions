import java.util.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //UPI
        //understand
        //input: give a sorted input meaning the duplcates are near each other   
        //output: return the head of the new linked list
        //edge case: the input can be 0 

        //plan
        //we do not need to O(n) space complexity we just need to if the number change to create a new node and add the new node to the new linked list     
        if(head == null) return null;

        ListNode newHead = new ListNode(head.val);
        ListNode pointerToReturn = newHead;

        while(head != null)
        {
            if(head.val != newHead.val)
            {
                ListNode temp = new ListNode(head.val);
                newHead.next = temp;
                newHead = temp;
                head = head.next;
            }else{
                head = head.next;
            }
        }

        return pointerToReturn;


    }
}