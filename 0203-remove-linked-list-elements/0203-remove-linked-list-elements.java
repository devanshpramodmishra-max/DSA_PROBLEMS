
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        if(head==null){
            return null;
        }
         while (head != null && head.val == val) {

            head = head.next;

        }
        while(temp.next!=null){
            if(temp.next.val==val){
                //iska mtlb temp.next ko remove kr dena hai 
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}