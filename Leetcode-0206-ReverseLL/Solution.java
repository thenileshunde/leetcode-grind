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

        // ****************** approach 1 Bruteforce - Using Stack **********************
        // ListNode tail = head;
        // Stack<Integer> stk = new Stack<>();
        // while(tail != null)
        // {
        //     stk.push(tail.val);
        //     tail = tail.next;
        // }
        // tail = head;
        // while(tail != null)
        // {
        //     tail.val = stk.pop();
        //     tail = tail.next;
        // }
        // return head;

        // ****************** approach 2 Optimal Interative - Using prev **********************
        ListNode tail = head, prev = null, rev = null; 
        while(tail != null)
        {
            prev = rev;
            rev = tail;
            tail = tail.next;
            rev.next = prev;
        }
        return rev;
    }
}