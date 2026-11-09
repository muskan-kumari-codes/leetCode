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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        
        for(int i=1; i<left; i++){
            prev = prev.next;
        }

        ListNode start = prev.next;
        ListNode curr = start;
        ListNode prev2 = null;

        for(int i=left; i<=right; i++){
            ListNode forward = curr.next;
            curr.next = prev2; 
            prev2 = curr;
            curr = forward;
        }
        start.next = curr;
        prev.next = prev2;
        return dummy.next;
    }
}
