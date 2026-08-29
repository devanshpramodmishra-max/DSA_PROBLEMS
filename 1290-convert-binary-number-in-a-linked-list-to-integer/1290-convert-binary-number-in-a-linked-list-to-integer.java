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
    public int getDecimalValue(ListNode head) {
        //mtlb we are provided with the value of teh numebrs as they are in teh form of teh linked lists
        int answer=0;

        while(head!=null){
            answer =answer *2 +head.val;
            head=head.next;
        }
        return answer;
    }
}