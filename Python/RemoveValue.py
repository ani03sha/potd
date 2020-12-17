"""
Given a linked list and a value, remove all nodes containing the provided value, 
and return the resulting list.
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def print_list(node: ListNode):
    while node is not None:
        print(str(node.val), end=" ")
        node = node.next
    print()


class RemoveValue:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        # Check if the value to be deleted is present at the head
        # and the next nodes to it
        while head is not None and head.val == val:
            head = head.next
        # Reference of head
        current = head
        # Previous to this current node
        # previous = head
        # Loop for all the nodes in the list
        while current is not None:
            #If the current node's data is equal to the value to
            # be deleted
            if current.val == val:
                # Link previous to next of current
                previous.next = current.next
            else:
                # Update previous node
                previous = current
            # Move current pointer ahead
            current = current.next
        return head


if __name__ == "__main__":
    r = RemoveValue()
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    value = 3
    print_list(r.removeElements(head, value))

    headNode = ListNode(8)
    headNode.next = ListNode(1)
    headNode.next.next = ListNode(1)
    headNode.next.next.next = ListNode(4)
    headNode.next.next.next.next = ListNode(12)
    value = 1
    print_list(r.removeElements(headNode, value))

    headNode = ListNode(7)
    headNode.next = ListNode(12)
    headNode.next.next = ListNode(2)
    headNode.next.next.next = ListNode(9)
    value = 7
    print_list(r.removeElements(headNode, value))
