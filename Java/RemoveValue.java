/**
 * Given a linked list and a value, remove all nodes containing the provided
 * value, and return the resulting list.
 */
public class RemoveValue {

    private static ListNode removeElements(ListNode head, int val) {
        // Check if the value to be deleted is present at the head
        // and the next nodes to it
        while (head != null && head.val == val) {
            head = head.next;
        }
        // Reference of head
        ListNode current = head;
        // Previous to this current node
        ListNode previous = head;
        // Loop for all the nodes in the list
        while (current != null) {
            // If the current node's data is equal to the value to
            // be deleted
            if (current.val == val) {
                // Link previous to next of current
                previous.next = current.next;
            } else {
                // Update previous node
                previous = current;
            }
            // Move current pointer ahead
            current = current.next;
        }
        return head;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    private static void printList(ListNode mergedList) {
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        int value = 3;
        printList(removeElements(head, value));

        head = new ListNode(8);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(12);
        value = 1;
        printList(removeElements(head, value));

        head = new ListNode(7);
        head.next = new ListNode(12);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(9);
        value = 7;
        printList(removeElements(head, value));
    }
}
