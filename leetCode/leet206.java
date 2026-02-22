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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head ;
        }
        ListNode rev  = new ListNode(head.val);
        head = head.next;
        while(head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = rev;
            rev = temp;
            head = head.next;
        }
        return rev;
    }
}
