"""
Given a linked list, containing unique numbers, return whether or not it has a cycle.
Note: a cycle is a circular arrangement (i.e. one node points back to a previous node)
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class ConstinsCycle:
    def hasCycle(self, head: ListNode) -> bool:
        # Slow and fast pointers
        slow = head
        fast = head
        # Loop until the two pointers meet or we reach the end
        while fast and fast.next:
            # Move slow pointer one step
            slow = slow.next
            # Move fast pointer two steps
            fast = fast.next.next
            # Check if both pointers have the same reference
            if slow == fast:
                return True
        return False


if __name__ == "__main__":
    c = ConstinsCycle()
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    head.next.next.next = head
    print(c.hasCycle(head))

    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    print(c.hasCycle(head))

    head = ListNode(1)
    head.next = head
    print(c.hasCycle(head))
