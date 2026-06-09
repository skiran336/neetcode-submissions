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
    public boolean hasCycle(ListNode head) {
           if(head == null){
            return false;
           }
           ListNode slow = head;
           ListNode speed = head;
           if(slow.next == null || speed.next == null){
            return false;
           }
           slow = slow.next;
           speed = speed.next.next;
           while(slow != null && speed != null){
                if(slow.next == null || speed.next == null){
                    return false;
                }
                else if(slow.val == speed.val){
                    return true;
                }
                else{
                    slow = slow.next;
                    speed = speed.next.next;
                }
           }
           return false;
    }
}
