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
            curr = forward;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);
        if(n==1){
            head = head.next;
        }
        else{
            ListNode temp = head;
            for(int i=1; i<=n-2; i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
        }
        head = reverse(head);
        return head;
    }
}
