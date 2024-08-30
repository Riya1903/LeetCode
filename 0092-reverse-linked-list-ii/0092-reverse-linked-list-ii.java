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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        // Dummy node to handle edge cases where reversal includes the head of the list
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Step 1: Move the 'prev' pointer to the node just before the `left` position
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: Start reversing the sublist
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode prevTail = curr;
        
        for (int i = 0; i < right - left + 1; i++) {
            next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }

        // Step 3: Connect the tail of the reversed sublist to the rest of the list
        prevTail.next = curr;

        return dummy.next;
    }
}