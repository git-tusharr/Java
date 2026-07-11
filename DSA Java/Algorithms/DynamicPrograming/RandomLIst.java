/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Map original node -> copied node
        Map<Node, Node> map = new HashMap<>();

        // First pass: create all copied nodes
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Second pass: connect next and random pointers
        curr = head;
        while (curr != null) {
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);       // null if curr.next is null
            copy.random = map.get(curr.random);   // null if curr.random is null
            curr = curr.next;
        }

        return map.get(head);
    }
}