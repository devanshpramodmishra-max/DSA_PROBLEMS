class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null){
            return null;
        }

        int size = 1;
        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
            size++;
        }

        temp = head;
        ListNode first = null;
        ListNode second = null;

        for(int i = 1; i <= size; i++){
            if(i == k){
                first = temp;
            }

            if(i == size + 1 - k){
                second = temp;
            }

            temp = temp.next;
        }

        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;
    }
}