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
    public void reorderList(ListNode head) {

        if (head.next == null)
            return;

        //split the list by getting the midd by 2ptrs
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode l1 = head;
        ListNode l2 = slow.next;
        slow.next = null;

        //then reverse the second list
        ListNode prev = null;
        ListNode curr = l2;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        l2 = prev;

        //finally start merging both list by taking node by node from each
        ListNode tmp1 = l1;
        ListNode tmp2 = l2;

        while (tmp1 != null && tmp2 != null) {

            ListNode n1 = tmp1.next;
            ListNode n2 = tmp2.next;
            
            tmp1.next = tmp2;
            if (n1 == null)
                break;
            tmp2.next = n1;

            tmp1 = n1;
            tmp2 = n2;
        }
    }
}