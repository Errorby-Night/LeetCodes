# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None:
            return head 
        reverse = ListNode(head.val)
        ptr = head.next
        while ptr is not None:
            current = ListNode(ptr.val)
            current.next = reverse
            reverse = current
            ptr = ptr.next
        return reverse

