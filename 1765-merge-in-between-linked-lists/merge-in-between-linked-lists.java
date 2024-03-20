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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int k  = b -a;
        ListNode ptr = list1;
        while(a-- > 1)
            ptr = ptr.next;
        ListNode temp = ptr.next;
        while(k-->0)
            temp = temp.next;
        ptr.next = list2;
        ptr = list2;
        while(ptr.next != null)
            ptr = ptr.next;
        ptr.next = temp.next;
        return list1;
    }
}