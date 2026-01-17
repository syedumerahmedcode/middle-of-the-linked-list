public class Solution {

    public ListNode middleNode(ListNode head) {
        /**
         * We will use fast and slow pointer approach in which:
         * - slow: +1 node
         * - fast: +2 node
         * we iterate through the list and terminate when fast=null or fast.next=null
         * At that moment, whatever the value of slow pointer is, will be the middle
         * value.
         */
        /**
         * initializing fats and slow parameters and setting their initial value as head
         */
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            /**
             * Do 1 jump for slow pointer
             */
            slow = slow.next;
            /**
             * Do 2 jump for fast pointer
             */
            fast = fast.next.next;
        }
        /**
         * This will be the middle of the linked list
         */
        return slow;
    }

}
