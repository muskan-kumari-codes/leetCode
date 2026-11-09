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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr= forward;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        int carry = 0;
        ListNode temp = head;
        while(temp!=null){
            int sum = temp.val + temp.val + carry;
            int digit = sum%10;
            carry = sum/10;
            temp.val = digit;
            temp = temp.next;
        }
        head = reverse(head);
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            head = newNode;
        }
        
        return head;
    }
}
