/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;
        if(head.next == null)
            return true;
        List<Integer> h = new ArrayList<>();
        ListNode ptr = head;
        while(ptr != null){
            h.add(ptr.val);
            ptr = ptr.next;
        }
        int i = 0, j = h.size()-1;
        while(i < j){
            if(h.get(i) != h.get(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}