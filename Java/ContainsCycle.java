/**
 * Given a linked list, containing unique numbers, return whether or not it has
 * a cycle. Note: a cycle is a circular arrangement (i.e. one node points back
 * to a previous node)
 */
public class ContainsCycle {

    private static boolean hasCycle(ListNode head) {
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Loop until two pointers meet
        while (fast != null && fast.next != null) {
            // Move slow pointer one step
            slow = slow.next;
            // Move fast pointer two steps
            fast = fast.next.next;
            // Check if both pointers have the same reference
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head;
        System.out.println(hasCycle(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println(hasCycle(head));

        head = new ListNode(1);
        head.next = head;
        System.out.println(hasCycle(head));
    }
}
