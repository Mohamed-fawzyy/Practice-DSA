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


        int pos = len - n + 1;
        temp = head;
        for (int i = 0; i < pos - 2; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}