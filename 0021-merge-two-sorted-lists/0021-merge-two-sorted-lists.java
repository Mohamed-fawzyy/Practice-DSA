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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        
        if ( (a == null && b == null) || b == null)
            return a;
        else if (a == null)
            return b;
            
        ListNode result = new ListNode(0, null);
        ListNode tail = result;

        while (a != null && b != null) {

            if (a.val <= b.val){
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a == null)
            tail.next = b;
        else
            tail.next = a;
        
        result = result.next;
        return result;
    }
}