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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null){
            return new int[]{-1,-1};
        }

        ListNode prev = head;
        ListNode curr = head.next;
        List<Integer> critical = new ArrayList<>();
        int i=1;
        while(curr!=null && curr.next!=null){
            if(prev.val > curr.val && curr.next.val > curr.val){
                critical.add(i);
            }
            if(prev.val < curr.val && curr.next.val < curr.val){
                critical.add(i);
            }
            prev= prev.next;
            curr = curr.next;
            i++;
        }
        int minDis = Integer.MAX_VALUE;
        int maxDis = Integer.MIN_VALUE;

        if(critical.size() < 2){
            return new int[]{-1,-1};
        }

        for(int j=1; j<critical.size(); j++){
            minDis = Math.min(minDis, critical.get(j)-critical.get(j-1));
            maxDis = critical.get(critical.size()-1)-critical.get(0);
        }
 
        return new int[]{minDis, maxDis};
    }
}
