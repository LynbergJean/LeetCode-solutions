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
    public boolean isPalindrome(ListNode head) {
      //reverse the second half of the list and compare their values
      if(head == null || head.next == null)
      {
        return true;
      } 

      ListNode slow = head;
      ListNode fast = head;

      while(fast != null && fast.next != null)
      {
        slow = slow.next;
        fast = fast.next.next;
      }
      //slow is not at the middle but there is a chance that fast is at null but does that even matter no

      //slow is our midpoint but can we start reversing from there what is it is even length or odd if its even then we can if is odd then move foward one 

      int length = 0;
      ListNode temp = head;

      while(temp != null)
      {
        length++;
        temp = temp.next;
      }

      if(length % 2 == 1)
      {
        slow = slow.next;
      }

      //the reversing process
      ListNode prev, cur, next;
      cur = slow;
      prev = null;
      next = slow.next;

      while(next != null)
      {
        cur.next = prev;
        prev = cur;
        cur = next;
        next = next.next;
      }

      //now reverse teh last node 
      cur.next = prev;


      //now compare them 
      
      while(cur != null)
      {
        if(cur.val != head.val)
        {
            return false;
        }

        cur = cur.next;
        head =  head.next;
      }

      return true;
    }
}