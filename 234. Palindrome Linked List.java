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
    static ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null){
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }


    public boolean isPalindrome(ListNode head) {
        ListNode list2 = middle(head);
        ListNode head2 = reverse(list2);

        ListNode temp = head;
        ListNode temp2 = head2;
        while(temp!=null && temp2!=null){
            if(temp.val != temp2.val){
                return false;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        return true;
    }
}
