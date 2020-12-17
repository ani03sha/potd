/**
 * Given a linked list, containing unique numbers, return whether or not it has
 * a cycle. Note: a cycle is a circular arrangement (i.e. one node points back
 * to a previous node)
 */
const hasCycle = (head) => {
    // Slow and fast pointers
    let slow = head;
    let fast = head;
    // Loop until two pointers meet
    while (fast !== null && fast.next !== null) {
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
};

function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val)
    this.next = (next === undefined ? null : next)
}

let headNode = new ListNode(1);
headNode.next = new ListNode(2);
headNode.next.next = new ListNode(3);
headNode.next.next.next = headNode;
console.log(hasCycle(headNode));

headNode = new ListNode(1);
headNode.next = new ListNode(2);
headNode.next.next = new ListNode(3);
console.log(hasCycle(headNode));

headNode = new ListNode(1);
headNode.next = headNode;
console.log(hasCycle(headNode));

