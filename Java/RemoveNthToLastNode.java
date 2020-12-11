/**
 * Given a linked list and a value n, remove the nth to last node and return the resulting list.
 */
public class RemoveNthToLastNode {

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        // Two pointers - fast and slow
        ListNode slow = head;
        ListNode fast = head;
        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast.next == null) {
                // If n is equal to the number of nodes, delete the head node
                if (i == n - 1) {
                    head = head.next;
                }
                return head;
            }
            fast = fast.next;
        }
        // Loop until we reach to the end.
        // Now we will move both fast and slow pointers
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // De-link the nth node from last
        if (slow.next != null) {
            slow.next = slow.next.next;
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
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printList(removeNthFromEnd(head, 2));

        head = new ListNode(1);
        printList(removeNthFromEnd(head, 1));

        head = new ListNode(1);
        head.next = new ListNode(2);
        printList(removeNthFromEnd(head, 1));
    }
}