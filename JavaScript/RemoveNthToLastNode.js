/**
 * Given a linked list and a value n, remove the nth to last node and return the resulting list.
 */
const removeNthFromEnd = (head, n) => {
    // Two pointers - fast and slow
    let slow = head;
    let fast = head;
    // Move fast pointer n steps ahead
    for (let i = 0; i < n; i++) {
        if (fast.next === null) {
            // If n is equal to the number of nodes, delete the head node
            if (i === n - 1) {
                head = head.next;
            }
            return head;
        }
        fast = fast.next;
    }
    // Loop until we reach to the end.
    // Now we will move both fast and slow pointers
    while (fast.next !== null) {
        slow = slow.next;
        fast = fast.next;
    }
    // De-link the nth node from last
    if (slow.next !== null) {
        slow.next = slow.next.next;
    }
    return head;
};

function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val)
    this.next = (next === undefined ? null : next)
}

function printList(node) {
    let list = [];
    while (node != null) {
        list.push(node.val);
        node = node.next
    }
    console.log(list.join(" "));
}

let headNode = new ListNode(1);
headNode.next = new ListNode(2);
headNode.next.next = new ListNode(3);
headNode.next.next.next = new ListNode(4);
headNode.next.next.next.next = new ListNode(5);
printList(removeNthFromEnd(headNode, 2));

headNode = new ListNode(1);
printList(removeNthFromEnd(headNode, 1));

headNode = new ListNode(1);
headNode.next = new ListNode(2);
printList(removeNthFromEnd(headNode, 1));