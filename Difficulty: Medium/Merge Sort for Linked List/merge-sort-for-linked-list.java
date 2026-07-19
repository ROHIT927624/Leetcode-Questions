/* Structure of Node
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {

    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the list
        Node mid = slow.next;
        slow.next = null;

        // Sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        // Merge sorted halves
        return merge(left, right);
    }

    static Node merge(Node a, Node b) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a != null) {
            tail.next = a;
        }

        if (b != null) {
            tail.next = b;
        }

        return dummy.next;
    }
}