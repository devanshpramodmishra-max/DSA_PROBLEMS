class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        int size = 1;
        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
            size++;
        }

        temp.next = head;

        k = k % size;

        temp = head;

        for(int i = 1; i < size - k; i++){
            temp = temp.next;
        }

        ListNode answer = temp.next;
        temp.next = null;

        return answer;
    }
}