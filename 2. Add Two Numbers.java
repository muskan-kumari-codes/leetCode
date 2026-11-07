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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ansH = new ListNode(-1);
        ListNode ansT = ansH;
        int sum = 0;
        while(l1!=null && l2!=null){
            sum = carry + l1.val + l2.val;
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            ansT.next = newNode;
            ansT = ansT.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            sum = l1.val + carry;
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            ansT.next = newNode;
            ansT = ansT.next;
            l1 = l1.next;
        }
        while(l2!=null){
            sum = l2.val + carry;
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            ansT.next = newNode;
            ansT = ansT.next;
            l2 = l2.next;
        }
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            ansT.next = newNode;
            ansT = ansT.next;
        }
        ansH = ansH.next;
        ansT.next = null;
        return ansH;
    }
}
