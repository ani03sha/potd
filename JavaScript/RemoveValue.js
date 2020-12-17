/**
 * Given a linked list and a value, remove all nodes containing the provided
 * value, and return the resulting list.
 */
const removeElements = (head, val) => {
    // Check if the value to be deleted is present at the head
    // and the next nodes to it
    while (head !== null && head.val === val) {
        head = head.next;
    }
    // Reference of head
    let current = head;
    // Previous to this current node
    let previous = head;
    // Loop for all the nodes in the list
    while (current !== null) {
        // If the current node's data is equal to the value to
        // be deleted
        if (current.val === val) {
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
};

const printList = (node) => {
    let list = [];
    while (node != null) {
        list.push(node.val);
        node = node.next
    }
    console.log(list.join(" "));
}

function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val)
    this.next = (next === undefined ? null : next)
}

let headNode = new ListNode(1);
headNode.next = new ListNode(2);
headNode.next.next = new ListNode(3);
let value = 3;
printList(removeElements(headNode, value));

headNode = new ListNode(8);
headNode.next = new ListNode(1);
headNode.next.next = new ListNode(1);
headNode.next.next.next = new ListNode(4);
headNode.next.next.next.next = new ListNode(12);
value = 1;
printList(removeElements(headNode, value));

headNode = new ListNode(7);
headNode.next = new ListNode(12);
headNode.next.next = new ListNode(2);
headNode.next.next.next = new ListNode(9);
value = 7;
printList(removeElements(headNode, value));