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
    public int size(ListNode head) {
        int count = 0;
        
        while (head != null) {
            head = head.next;
            count++;
        }
        
        return count;
    }
    
    public ListNode middleNode(ListNode head) {
        int count = size(head);
        count /= 2;
        
        while (count-- > 0) {
            head = head.next;
        }
        
        return head;
    }
}

