
class Solution {
    //here we are given with the list and now we need to change the value of teh list without changing an returning the value of teh node 
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}