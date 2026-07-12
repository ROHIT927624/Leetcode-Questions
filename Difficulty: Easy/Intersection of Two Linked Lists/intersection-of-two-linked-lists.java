class Solution {
    public Node findIntersection(Node head1, Node head2) {

        HashSet<Integer> set = new HashSet<>();

        Node temp = head2;
        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }

        Node dummy = new Node(0);
        Node tail = dummy;

        temp = head1;
        while (temp != null) {
            if (set.contains(temp.data)) {
                tail.next = new Node(temp.data);
                tail = tail.next;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}