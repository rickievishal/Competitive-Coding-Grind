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
        List<Integer> l = new ArrayList<>();

        while(head != null){
            l.add(head.val);
            head = head.next;
        }
        int n = l.size();
        for(int i = 0 ; i < n/2 ; i++){
            if(l.get(i) != l.get(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
