class Solution {
    public Node rotate(Node head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        // Find length and tail
        int length = 1;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;

        if (k == 0)
            return head;

        // Move to kth node
        Node curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        Node newHead = curr.next;

        // Break the list
        curr.next = null;

        // Attach old tail to old head
        tail.next = head;

        return newHead;
    }
}