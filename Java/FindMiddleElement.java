/**
 * Given a non-empty linked list, return the middle node of the list. If the
 * linked list contains an even number of elements, return the node closer to
 * the end.
 */
public class FindMiddleElement {

    private static ListNode middleNode(ListNode head) {
        // Slow and fast pointer
        ListNode slow = head;
        ListNode fast = head;
        // Loop until the fast pointer reaches to the end of the list
        while (fast != null && fast.next != null) {
            // Move slow pointer one step
            slow = slow.next;
            // Move fast pointer two steps
            fast = fast.next.next;
        }
        return slow;
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
        System.out.println(middleNode(head).val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println(middleNode(head).val);

        head = new ListNode(1);
        System.out.println(middleNode(head).val);
    }
}
