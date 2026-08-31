public class Solution {
    //basically we van check the loop of the array with just nexxt or the array equality
    public ListNode detectCycle(ListNode head) {

        ListNode p1 = head; // slow
        ListNode p2 = head; // fast

        // Find whether cycle exists
        while (p2 != null && p2.next != null) {

            p1 = p1.next;
            p2 = p2.next.next;

            if (p1 == p2) {
                break;
            }
        }

        // No cycle
        if (p2 == null || p2.next == null) {
            return null;
        }

        // Find starting point of cycle
        p1 = head;

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}