"""
Given a linked list, containing unique values, reverse it, and return the result.
"""


class ListNode:
    def __init__(self, val=0, nextNode=None):
        self.val = val
        self.next = nextNode


class ReverseList:
    def print_list(self, node: ListNode):
       while node is not None:
            print(str(node.val), end=" ")
            node = node.next

    def reverseList(self, head: ListNode) -> ListNode:
        # Base condition
        if head is None or head.next is None:
            return head
        # Reference of the head
        currentNode = head
        # Previous node of the current
        previousNode = None
        # Next node of the current
        nextNode = None
        # Loop for all the nodes in the list
        while currentNode:
            # Get the reference of the next
            nextNode = currentNode.next
            # ake the original next node as the previous node
            currentNode.next = previousNode
            # Update the previous node
            previousNode = currentNode
            currentNode = nextNode
        return previousNode


if __name__ == "__main__":
    r = ReverseList()
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    head.next.next.next = ListNode(4)
    head.next.next.next.next = ListNode(5)
    r.print_list(r.reverseList(head))