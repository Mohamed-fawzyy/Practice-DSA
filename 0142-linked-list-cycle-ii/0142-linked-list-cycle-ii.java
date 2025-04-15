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
    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null)
            return null;
        
        ListNode slwPtr = head;
        ListNode fstPtr = head;
        ListNode tail = head;

        boolean hasCycle = false;

        while (fstPtr != null && fstPtr.next != null){

            slwPtr = slwPtr.next;
            fstPtr = fstPtr.next.next;

            if (slwPtr == fstPtr){
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle)
            return null;

        while (tail != slwPtr){
            
            tail = tail.next;
            slwPtr = slwPtr.next;
        }

        return slwPtr;
    }
}