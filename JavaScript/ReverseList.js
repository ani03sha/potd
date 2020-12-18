/**
 * Given a linked list, containing unique values, reverse it, and return the
 * result.
 */
const reverseList = (head) => {
    // Base condition
    if (head === null || head.next === null) {
        return head;
    }
    // Reference of the head
    let current = head;
    // Previous node pointer
    let previous = null;
    // Next node of the current node
    let next = null;
    // Loop through all the nodes of the linked list
    while (current !== null) {
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
headNode.next.next.next = new ListNode(4);
headNode.next.next.next.next = new ListNode(5);
printList(reverseList(headNode));