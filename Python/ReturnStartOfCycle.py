"""
Given a potentially cyclical linked list where each value is unique, return the node at which the 
cycle starts. If the list does not contain a cycle, return null.
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next



class ReturnStartOfCycle:
    def detectCycle(self, head: ListNode) -> ListNode:
        # Slow and fast pointers
        slow, fast = head, head
        # Loop until the two pointers meet or we reach the end
        while fast and fast.next:
            # Move slow pointer one step
            slow = slow.next
            # Move fast pointer two steps
            fast = fast.next.next
            # Check if both pointers have the same reference
            if slow == fast:
                break
        else:
            return None
        # Point slow to head
        slow = head
        # Loop until slow meets fast
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow


if __name__ == "__main__":
    r = ReturnStartOfCycle()
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    head.next.next.next = head
    print(r.detectCycle(head))

    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    print(r.detectCycle(head))

    head = ListNode(1)
    head.next = head
    print(r.detectCycle(head))
