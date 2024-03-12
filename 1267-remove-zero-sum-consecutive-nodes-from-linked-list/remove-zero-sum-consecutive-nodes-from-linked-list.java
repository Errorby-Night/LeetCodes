class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head.next == null && head.val == 0)
            return null;
        // Edge case: empty list or single node
        if (head == null || head.next == null)
            return head;

        // Dummy node to handle the case where the first sublist sums to zero
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = dummy;

        // Map to store prefix sums and their corresponding nodes
        Map<Integer, ListNode> prefixSums = new HashMap<>();
        int sum = 0;

        // Traverse the list to compute prefix sums
        while (ptr != null) {
            sum += ptr.val;
            prefixSums.put(sum, ptr);
            ptr = ptr.next;
        }

        // Reset pointers
        ptr = dummy;
        sum = 0;

        // Traverse again to remove zero-sum consecutive nodes
        while (ptr != null) {
            sum += ptr.val;
            ptr.next = prefixSums.get(sum).next;
            ptr = ptr.next;
        }

        return dummy.next;
    }
}
