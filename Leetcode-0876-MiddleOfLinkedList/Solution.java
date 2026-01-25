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
    public ListNode middleNode(ListNode head) {
        // ****************** approach 1 Optimal - Calculating length of LL **********************
        // int length = 0;
        // ListNode temp = head;
        // while(temp!=null)
        // {
        //     temp = temp.next;
        //     length++;
        // }
        // int i=0;
        // ListNode middle = head;
        // while(i<length/2)
        // {
        //     middle = middle.next;
        //     i++;
        // }
        // return middle;

        // ****************** approach 2 Optimal - Using Slow Fast Pointer **********************
        ListNode slow =head, fast = head; 
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}