const detectCycle = (head) => {
    // Slow and fast pointers
    let slow = head;
    let fast = head;
    // Loop until two pointers meet
    while (fast&& fast.next) {
        // Move slow pointer one step
        slow = slow.next;
        // Move fast pointer two steps
        fast = fast.next.next;
        // Check if both pointers have the same reference
        if (slow === fast) {
            break;
        }
    }
    if (!fast || !fast.next) {
        return null;
    }
    // Move slow to the head
    slow = head;
    // Loop until slow meets fast
    while (slow !== fast) {
        slow = slow.next;
        fast = fast.next;
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
headNode.next.next.next = headNode;
console.log(detectCycle(headNode));

headNode = new ListNode(1);
headNode.next = new ListNode(2);
headNode.next.next = new ListNode(3);
console.log(detectCycle(headNode));

headNode = new ListNode(1);
headNode.next = headNode;
console.log(detectCycle(headNode));