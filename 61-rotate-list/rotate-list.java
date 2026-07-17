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
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode tail1 = head;
        int len = 1;
        while(tail1.next != null){
            tail1 = tail1.next;
            len++;
        }
        k %= len;
        if(k == 0){
            return head;
        }
        tail1.next = head;
        ListNode tail2 = head;
        for(int i = 0; i<len - k - 1; i++){
            tail2 = tail2.next;
        }
        ListNode head2 = tail2.next;
        tail2.next = null;
        return head2;
    }
}