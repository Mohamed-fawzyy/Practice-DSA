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
        
        if (head == null) return null;

        ListNode curr = head;
        ListNode newHead = null;

        while (curr != null){

            ListNode newNode = new ListNode(curr.val, null);
            newNode.next = newHead;
            newHead = newNode;

            curr = curr.next;
            System.out.println(newNode.val + "--> ");
        }
        return newHead;
    }
}