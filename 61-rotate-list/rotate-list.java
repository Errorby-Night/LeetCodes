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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        
        int l = 1;
        ListNode tail = head;
        while(tail.next!=null){
            l++;
            tail = tail.next;
        }
        k %= l;
        if(k == 0)
            return head;
        ListNode ptr = head;
        for(int i = 0; i < l - k - 1; i++)
            ptr = ptr.next;
        ListNode newhead = ptr.next;
        ptr.next = null;
        tail.next = head;
        return newhead;
    }
}