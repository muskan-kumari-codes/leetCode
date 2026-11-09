/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.child==null){
                temp = temp.next;
            }else{
                Node forward = temp.next;
                temp.next = temp.child;
                temp.child.prev = temp;
                Node ch = temp.child;
                while(ch.next!=null){
                    ch = ch.next;
                }
                ch.next = forward;
                if(forward!=null){
                    forward.prev = ch;
                }
                temp.child = null;
                temp = temp.next;
            }
        }
        return head;
    }
}
