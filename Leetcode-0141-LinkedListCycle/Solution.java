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

        // ****************** approach 1 Bruteforce - Using HashSet to store visited nodes **********************

        // ListNode tail = head;
        // Set<ListNode> visitedNodes = new HashSet<>();
        // while(tail != null)
        // {
        //     if(visitedNodes.contains(tail))
        //     {
        //         return true;
        //     }
        //     else{
        //         visitedNodes.add(tail);
        //     }
        //     tail = tail.next;
        // }
        // return false;

        // ****************** approach 2 Optimal - Using Slow Fast Pointer **********************

        // In case there is a loop - the fast pointer moves 2 points to the slow
        // slow pointer moves away from the fast by 1 point 
        // so the fast is effectively going closer to slow by 1 point on each move.
        // this makes sure that fast will eventually catch up with slow - this confirms the loop.
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
        
        
    }
}