class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode fast = head;
        ListNode first = null;
        ListNode second = head;

        // Move fast to kth node
        for(int i = 1; i < k; i++){
            fast = fast.next;
        }

        first = fast;

        // Move both pointers
        while(fast.next != null){
            fast = fast.next;
            second = second.next;
        }

        // Swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}