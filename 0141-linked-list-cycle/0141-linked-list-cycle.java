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
        
        ListNode slwPtr = head;
        ListNode fstPtr = head;

        while (fstPtr != null && fstPtr.next != null){

            slwPtr = slwPtr.next;
            fstPtr = fstPtr.next.next;

            if (slwPtr == fstPtr)
                return true;
        }

        return false;
    }
}