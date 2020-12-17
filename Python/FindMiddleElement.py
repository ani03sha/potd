"""
Given a non-empty linked list, return the middle node of the list. 
If the linked list contains an even number of elements, return the node closer to the end.
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class FindMiddleElement:
    def middleNode(self, head: ListNode) -> ListNode:
        # Slow and fast pointers
        slow = head
        fast = head
        # Loop until the fast pointer reaches to the end of
        # the list
        while fast and fast.next:
            # Move slow pointer one step
            slow = slow.next
            # Move fast pointer two steps
            fast = fast.next.next
        return slow


if __name__ == "__main__":
    f = FindMiddleElement()
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    print(f.middleNode(head).val)

    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    head.next.next.next = ListNode(4)
    print(f.middleNode(head).val)

    head = ListNode(1)
    print(f.middleNode(head).val)
