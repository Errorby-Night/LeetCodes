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
    public void reorderList(ListNode head) {
        ListNode ptr = head;
        List<Integer> reverse = new ArrayList<>();
        while(ptr != null){
            reverse.add(ptr.val);
            ptr = ptr.next;
        }
        int i = 0, j = reverse.size() - 1;
        ptr = head;
        while(i <= j){
            ptr.val = reverse.get(i);
            if(ptr.next != null)
                ptr = ptr.next;
            ptr.val = reverse.get(j);
            ptr = ptr.next;
            i++;
            j--;
        }
    }
}