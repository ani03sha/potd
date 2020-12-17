/**
 * Given a non-empty linked list, return the middle node of the list. If the
 * linked list contains an even number of elements, return the node closer to
 * the end.
 */
const middleNode = (head) => {
    // Slow and fast pointer
    let slow = head;
    let fast = head;
    // Loop until the fast pointer reaches to the end of the list
    while (fast != null && fast.next != null) {
        // Move slow pointer one step
        slow = slow.next;
        // Move fast pointer two steps
        fast = fast.next.next;
    }
    return slow;
};

function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val)
    this.next = (next === undefined ? null : next)
}

let headNode = new ListNode(1);
headNode.next = new ListNode(2);
headNode.next.next = new ListNode(3);
console.log(middleNode(headNode).val);

headNode = new ListNode(1);
headNode.next = new ListNode(2);
headNode.next.next = new ListNode(3);
headNode.next.next.next = new ListNode(4);
console.log(middleNode(headNode).val);

headNode = new ListNode(1);
console.log(middleNode(headNode).val);