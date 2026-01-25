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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // ****************** approach 1 Optimal - Simple to Understand **********************
        // int length = 0;
        // ListNode counter = head;
        // ListNode tail = head;
        // while(counter != null)
        // {
        //     length++; counter=counter.next;
        // }
        // if(length == n) return head.next;
        // int i = length-n-1;
        // while(i>0)
        // {
        //     tail = tail.next;
        //     i--;
        // }
        // tail.next = tail.next != null? tail.next.next : null;
        // return head; 

        // ****************** approach 2 Optimal - Single Pass **********************
        
        ListNode fast = head, slow = head;
        for(int i =0; i<n; i++)
        {
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next; fast = fast.next;
        }
        slow.next = slow.next != null? slow.next.next : null;
        return head;
    }
}