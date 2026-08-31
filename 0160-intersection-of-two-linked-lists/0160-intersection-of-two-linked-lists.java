/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //we are given with the two of the list which intersect at some point 
        //say the common node be a node 
        ListNode p1=headA;
        ListNode p2=headB;
        //we have made the both nodes and noww we need to iterate the lists
        while(p1!=p2){
            //ab isme hame bs wo conditions dekhni hai 
            if(p1==null){
                p1=headB;
            }
            else{p1=p1.next;
            }

            if(p2==null){
                p2=headA;
            }
            else{p2=p2.next;
            }
        }
        return p1;
    }
}