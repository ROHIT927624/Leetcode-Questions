/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0;
        int lenB=0;

        ListNode a =headA;
        ListNode b=headB;

        while(a!=null){
            lenA++;
            a=a.next;
        }
        while(b!=null){
            lenB++;
            b=b.next;
        }

        //a and b reached null while counting len and now we have to statrt from start for checking intersect node
        a= headA;
        b= headB;

        while(lenA>lenB){//if len of A is greater move till equal len of another list
            a=a.next;
            lenA--;
        }
        while(lenB>lenA){//if len of B is greater move till equal len of another list
            b=b.next;
            lenB--;
        }

        //now start comparing using two pointers until they find equal node
        while(a!=b){
            a=a.next;
            b=b.next;
        }
        //we can return a or b any 
        return a;

    }
}