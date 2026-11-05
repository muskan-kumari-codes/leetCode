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
    public ListNode mergeNodes(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode read = head.next;
        ListNode write = head;
        int sum = 0;
        while(read!=null){
            if(read.val!=0){
                sum+=read.val;
            }else{
                write.val = sum;
                write.next = read.next;
                write = write.next;
                sum=0;
            }
            read = read.next;
        }
        return head;
    }
}
