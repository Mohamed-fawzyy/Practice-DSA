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
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) return null;

        for (int i=1; i < lists.length; i++) {
            lists[i] = merge(lists[i], lists[i-1]);
        }

        return lists[lists.length - 1];
    }

    public ListNode merge(ListNode left, ListNode right){

        ListNode dummy = new ListNode(0, null);
        ListNode tail = dummy;

        while (left != null && right != null){

            if (left.val <= right.val){
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        tail.next = (left != null) ? left : right;
        return dummy.next;
    }
}