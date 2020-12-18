/**
 * Given a potentially cyclical linked list where each value is unique, return
 * the node at which the cycle starts. If the list does not contain a cycle,
 * return null.
 */
public class ReturnStartOfCycle {

    private static ListNode detectCycle(ListNode head) {
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
                break;
            }
        }
        if (slow == fast) {
            // Point slow to head
            slow = head;
            // Loop until slow meets fast
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } else {
            return null;
        }
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
        System.out.println(detectCycle(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println(detectCycle(head));

        head = new ListNode(1);
        head.next = head;
        System.out.println(detectCycle(head));
    }
}