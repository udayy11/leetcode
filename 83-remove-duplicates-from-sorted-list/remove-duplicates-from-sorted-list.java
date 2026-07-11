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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        Set<Integer> set = new TreeSet<>();
        while(current != null){
            set.add(current.val);
            current = current.next;
        }
        current = head;
        ListNode result = new ListNode(0);
        ListNode curr = result;
        for(int num : set){
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return result.next;
    }
}