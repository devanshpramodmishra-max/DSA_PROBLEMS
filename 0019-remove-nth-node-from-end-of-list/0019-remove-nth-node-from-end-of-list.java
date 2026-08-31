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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //we need to remove the nth element from the end 
        
        if(head==null){
            return null;
        }
        
            //mtlb we need to remove the element from the last
        
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            size=size+1;
            temp=temp.next;
        }
        if(n==size){
            return head.next;
        }
        temp=head;
        for(int i=0;i<size-n-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}