/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //reversing second half
        Node prev=null;
        while(slow!=null){
            Node nxt=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nxt;
        }
//checking
    Node left = head;
    Node right = prev;

    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
            left=left.next;
            right=right.next;
        
    }
    return true;
    }
}