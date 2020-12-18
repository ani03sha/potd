/**
 * Given a linked list, containing unique values, reverse it, and return the
 * result.
 */
public class ReverseList {

    private static ListNode reverseList(ListNode head) {
        // Base condition
        if (head == null || head.next == null) {
            return head;
        }
        // Reference of the head
        ListNode current = head;
        // Previous node pointer
        ListNode previous = null;
        // Next node of the current node
        ListNode next = null;
        // Loop through all the nodes of the linked list
        while (current != null) {
            // Get the reference of the next node
            next = current.next;
            // Make the original next node as the previous node
            current.next = previous;
            // Update the previous node
            previous = current;
            current = next;
        }
        // Return the head
        return previous;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printList(reverseList(head));
    }
}
