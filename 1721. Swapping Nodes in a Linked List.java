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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        for(int i=1; i<k; i++){
            temp = temp.next;
        }
        ListNode head2 = temp;
        ListNode head1 = head;
        while(temp.next!=null){
            head1 = head1.next;
            temp = temp.next;
        }
        int val = head2.val;
        head2.val = head1.val;
        head1.val = val;

        return head;
    }
}
