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
    //    Map m = new HashMap<Integer, Integer> 
        int index = -1;
        if (head ==null || head.next == null || head.next.next == null) return false;
        ListNode fast = head.next.next;
        ListNode slow = head.next;

        while (fast != slow ) {
            if (fast.next == null || fast.next.next == null) return false;
            
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        // int index = 0;
        while (fast != slow) {
            index ++;
            fast = fast.next;
        }
        System.out.println("Index - "+ index);
        return true;
    }
}
