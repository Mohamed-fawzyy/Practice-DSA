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
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        
        ListNode result = new ListNode(0, null);
        ListNode tail = result;

        int carry = 0;

        while (a != null || b != null){

            int x = (a != null) ? a.val : 0;
            int y = (b != null) ? b.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            tail.next = new ListNode(sum % 10, null);

            tail = tail.next;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }

        if (carry > 0 )
            tail.next = new ListNode(carry, null);
        
        result = result.next;
        return result;
    }
}