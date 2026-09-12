class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;

        while (true) {

            // Find kth node
            ListNode kth = prevGroup;

            for (int i = 0; i < k; i++) {
                kth = kth.next;

                if (kth == null) {
                    return dummy.next;
                }
            }

            // Node after the current group
            ListNode groupNext = kth.next;

            // Reverse current group
            ListNode prev = groupNext;
            ListNode current = prevGroup.next;

            while (current != groupNext) {

                ListNode next = current.next;

                current.next = prev;

                prev = current;
                current = next;
            }

            // Connect previous part to reversed group
            ListNode groupStart = prevGroup.next;
            prevGroup.next = kth;

            // Move prevGroup to the end of reversed group
            prevGroup = groupStart;
        }
    }
}