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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)  return list2;
        if (list2 == null)  return list1;
        ListNode head = null;
        ListNode merged = null;

        while( list1 != null && list2 != null) {
            ListNode temp;
            if (list1.val <= list2.val) {
                temp = list1; 
                list1 = list1.next; 
                temp.next = null;
                
            }
            else {
                temp = list2; 
                list2 = list2.next; 
                temp.next = null;
            }

            if(head == null) {
                    head = temp;
                    merged = temp;
                } else {
                    merged.next = temp;
                    merged = merged.next;
                }
        }

        if (list1 != null) {
            merged.next = list1;
        } 
        else {
            merged.next = list2;
        }

        return head;
        
    }
}