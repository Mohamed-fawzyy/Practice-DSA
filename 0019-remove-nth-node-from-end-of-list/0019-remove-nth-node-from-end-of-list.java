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
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: If the node to remove is the head
        if (n == len) {
            return head.next;
        }

        // Step 3: Traverse to the node just before the one to delete
        temp = head;
        for (int i = 0; i < len - n - 1; i++) {
            temp = temp.next;
        }

        // Step 4: Remove the nth node from the end
        temp.next = temp.next.next;

        return head;
    }
}