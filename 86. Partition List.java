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
    public ListNode partition(ListNode head, int x) {
        ListNode lowH = new ListNode(-1);
        ListNode lowT = lowH;

        ListNode highH = new ListNode(-1);
        ListNode highT = highH;

        ListNode temp = head;
        while(temp!=null){
            if(temp.val < x){
                ListNode insert = temp;
                temp = temp.next;
                insert.next = null;
                lowT.next = insert;
                lowT = lowT.next;
                
            }
            else{
                ListNode insert = temp;
                temp = temp.next;
                insert.next = null;
                highT.next = insert;
                highT = highT.next;
                
            }
            
        }
        lowT.next = highH.next;
        highT.next = null;
        lowH = lowH.next;
        return lowH;
    }
}
