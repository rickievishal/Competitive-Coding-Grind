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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode();
        ListNode head = res;
        while(l1 != null && l2 != null){
            int a = l1.val;
            int b = l2.val;
            ListNode r = new ListNode((a+b+carry)%10);

            if((a+b+carry) >= 10){
                carry = 1;
            }else{
                carry =0;
            }
            res.next = r;
            res = r;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null){
            while(l1 != null){
                int a = l1.val;
                ListNode r = new ListNode((a+carry)%10);
                if((a + carry) >= 10){
                    carry = 1;
                }else{
                    carry = 0;
                }
                res.next = r;
                res = r;
                l1 = l1.next;
            }
        }else{
            while(l2 != null){
                int a = l2.val;
                ListNode r = new ListNode((a+carry)%10);

                if((a + carry) >= 10){
                    carry = 1;
                }else{
                    carry = 0;
                }
                res.next = r;
                res = r;
                l2 = l2.next;
            }
        }
        if(carry == 1){
            res.next = new ListNode(1);
        }
        return head.next;
    }
}
